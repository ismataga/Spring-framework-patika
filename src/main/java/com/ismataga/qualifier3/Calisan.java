package com.ismataga.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi3")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterFace patronInterFace;


//    @Inject
//    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
//    private PatronInterFace patronInterFace;



    public String getData(String data){
        return  patronInterFace.surum(data);
    }
}
