/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author MuHamd Gomaa
 */

    @Path("injectdemo")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
public class injectDemo {
    
    @GET
    @Path("annotations")
    public String anotations(@MatrixParam("param") String param,
                              @HeaderParam("customHeadervalue") String hparam,
                               @CookieParam("name") String value){
    
    return "value = "+param +" header = "+hparam +" cookie ="+value;
    
    }
    
    
    
    
    
    
    
}
