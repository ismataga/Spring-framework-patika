package com.ismataga.ioclidi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "cdliiosliCalisan")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterFace patronInterFace;
    public  Calisan(){
//        patronInterFace = new Patron();
    }

    public String getData(String data){
        return  patronInterFace.surum("17");
    }
}
