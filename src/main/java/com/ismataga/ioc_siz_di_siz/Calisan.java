package com.ismataga.ioc_siz_di_siz;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {
    private Patron patron;
    public  Calisan(){
        patron = new Patron();
    }

    public String getData(String data){
        return  patron.surum("17");
    }
}
