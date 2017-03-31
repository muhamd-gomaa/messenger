/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import model.darabase;
import model.moedl_message;

/**
 *
 * @author MuHamd Gomaa
 */
public class message_services {

    public Map<Integer, moedl_message> message = darabase.getMesseges();

    public message_services() {

        message.put(1, new moedl_message(1, "heloo", new Date(2012, 10, 15)));
        message.put(2, new moedl_message(2, "msr", new Date(2015, 10, 15)));
          message.put(3, new moedl_message(3, "heloo", new Date(2012, 10, 15)));
        message.put(4, new moedl_message(4, "msr", new Date(2015, 10, 15)));
    }

    moedl_message mes = new moedl_message();

    public List<moedl_message> getall() {

        return new ArrayList<model.moedl_message>(message.values());
    }

    public List<moedl_message> getmessegesby_year(int year) {

        List<moedl_message> messageforyear = new ArrayList<>();

        Calendar calc = Calendar.getInstance();

        for (moedl_message mes : message.values()) {

            calc.setTime(mes.getAuther());

            if (calc.get(Calendar.YEAR) == year) {
                messageforyear.add(mes);
            }

        }

        return messageforyear;

    }
    
    
    public List<moedl_message> getpignatedmessage(int start,int size){
    
List<moedl_message> list=new ArrayList<>(message.values());

if(start+size>list.size())
    return new ArrayList<moedl_message>();

return list.subList(start,start+size);

    }

    //get one message
    public moedl_message getmessage(Integer id) {
        return message.get(id);
    }
        //add message

    public moedl_message addmessage(moedl_message mm) {

        mm.setId(message.size() + 1);

        message.put(mm.getId(), mm);
        return mm;
    }

    public moedl_message updatemessage(moedl_message mes) {

        if (mes.getId() < 0) {

            return null;
        }
        message.put(mes.getId(), mes);

        return mes;

    }

    //remove
    public void delete(int id) {

        message.remove(id);

    }

}
