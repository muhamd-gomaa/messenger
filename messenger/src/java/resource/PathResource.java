/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author MuHamd Gomaa
 */
@Path("/path")
public class PathResource {
     @Context
    private UriInfo context;

    public PathResource() {
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
return "hahahah";
        
        }

}
