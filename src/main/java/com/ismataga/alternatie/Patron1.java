package com.ismataga.alternatie;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "patron1 " + data;
    }
}
