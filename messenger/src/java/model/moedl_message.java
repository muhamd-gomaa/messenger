/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MuHamd Gomaa
 */
@XmlRootElement
public class moedl_message {
    
    private int id;
    private String mcontent;
        private Date  auther;
        
       public moedl_message(){
           
           
        }

    public int getId() {
        return id;
    }

    public moedl_message(int id, String mcontent, Date auther) {
        this.id = id;
        this.mcontent = mcontent;
        this.auther = auther;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Date getAuther() {
        return auther;
    }

    public void setAuther(Date auther) {
        this.auther = auther;
    }

    
}
