package com.ismataga.qualifier;

@QualifierMultiple
public class Patron2 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 1 " + data;
    }
}
