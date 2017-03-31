/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MuHamd Gomaa
 */
public class data {
    
    
    
    public static List<moedl_message> get_all_message(){
        
        model.moedl_message md=new moedl_message(1, "welcome",new Date());
                model.moedl_message md2=new moedl_message(2, "hell",new Date());
List<moedl_message> ll = new ArrayList<moedl_message>();
        ll.add(md);
        ll.add(md2);
        return ll;
        
    }
    
    
    
    
    
    
    
    
}
