/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.darabase;
import model.moedl_message;
import model.profile;
import services.profilesservices;

@Path("profiles")
public class ProfileResorce {
    
    
    public Map<String,profile> profile=darabase.getProfiles();
    
    profilesservices pro=new profilesservices();
    
    public ProfileResorce (){
        
      
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<profile> getprofiles(){
    
    return pro.getall();
    
    }
    
     @GET
    @Path("/{profilename}")
    @Produces(MediaType.APPLICATION_JSON)
    public profile getprofile(@PathParam("profilename") String  proname) {
        return pro.getprofile(proname);
        }
    
     @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public profile addprofile(profile p){
    
    return pro.addprofile(p);
    }
    
    @PUT
    @Path("/{profilename}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public profile updatprofile(@PathParam("profilename") String  profilename ,profile p){
    
        p.setProfilename(profilename);
    return pro.updateprofile(p);
    }
    
    
    
    @DELETE
     @Path("/{profilename}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
     public profile deeteprofiel(@PathParam("profilename") String  profilename){
    
    return pro.delete(profilename);
    }
    
    
    
    
    
    
    
    
    
}
