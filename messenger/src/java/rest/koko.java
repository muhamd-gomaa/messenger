/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.data;
import model.moedl_message;
import resource.commentResources;
import services.message_services;

/**
 * REST Web Service
 *
 * @author MuHamd Gomaa
 */
@Path("messeges")
public class koko {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PathResource
     */
    public koko() {
    }
message_services messege_service=new message_services();
    /**
     * Retrieves representation of an instance of service.PathResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<moedl_message> getallmessage(@QueryParam("year") int year,
                                             @QueryParam("start") int start,
                                             @QueryParam("size") int size) {
     if(year>0){
         
      return messege_service.getmessegesby_year(year);
     }
     if(start>0 && size>0){
     return messege_service.getpignatedmessage(start, size);
     
     }
        
        return messege_service.getall();
        
        }
    @GET
    @Path("/{messegeid}")
    @Produces(MediaType.APPLICATION_JSON)
    public moedl_message test(@PathParam("messegeid") int  messegeid) {
        return messege_service.getmessage(messegeid);
        }
    //add
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public moedl_message add_message(moedl_message mesage){
    
    return messege_service.addmessage(mesage);
    }
    //update
    @PUT
    @Path("/{messegeid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public moedl_message updatemesaage(@PathParam("messegeid") int  messegeid ,moedl_message mesage){
    
        mesage.setId(messegeid);
    return messege_service.updatemessage(mesage);
    }
    //delete
//    @PUT
//    @Path("/{messegeid}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deletemessage(@PathParam("messegeid") int  messegeid){
//    
//    messege_service.delete(messegeid);
//    }
//    
    @Path("/{messegeid}/comments")
    public commentResources getRecourses(){
    return new commentResources();
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * PUT method for updating or creating an instance of PathResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
