package com.ismataga.alternatie;
import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "patron 2 " + data;
    }
}
