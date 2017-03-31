/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author MuHamd Gomaa
 */

//sub resourses class
public class commentResources {
    
    
    @GET
    @Path("/{commentid}")
    public int test(@PathParam("commentid") int cid){
    return cid;
    }
    
}
