/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import model.darabase;
import model.moedl_message;
import model.profile;

/**
 *
 * @author MuHamd Gomaa
 */
public class profilesservices {
      public Map<String,profile> profile =darabase.getProfiles();
    public  profilesservices(){
        
       profile.put("mohamed", new profile(1, "mohmed", "mo", "koc1", new Date()));
        profile.put("ahmed", new profile(2, "ahmed", "ah", "vkoc", new Date()));
    }
    public List<profile> getall(){
  

    return new ArrayList<model.profile>(profile.values());
    }
    public profile getprofile(String proname){
  

    return profile.get(proname);
    }
    
    
    
     public profile addprofile(profile p){
    
    
    p.setId(profile.size()+1);
    
   profile.put(p.getProfilename(), p);
      return p;
    }
     
     public profile updateprofile(profile pro){
    
    if(pro.getProfilename().isEmpty()){
    
    return null;
    }
    profile.put(pro.getProfilename(), pro);
    
    return pro;
        
    }
     
        //remove
    public profile delete(String proname){
    
    return profile.remove(proname);
    
    }
    
    
    
    
    
}
