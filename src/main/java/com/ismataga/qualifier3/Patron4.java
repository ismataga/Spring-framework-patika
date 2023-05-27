package com.ismataga.qualifier3;
@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM UCUNCU " + data;
    }
}
