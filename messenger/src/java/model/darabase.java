/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MuHamd Gomaa
 */
public class darabase {
    
private static  Map<Integer,moedl_message> messeges = new HashMap <>();
private static  Map<String,profile> profiles = new HashMap <>();

    public static Map<Integer, moedl_message> getMesseges() {
        return messeges;
    }

    public static Map<String, profile> getProfiles() {
        return profiles;
    }




    
}
