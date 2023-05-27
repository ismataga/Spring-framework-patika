package com.ismataga.qualifier3;
@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM IKINCI " + data;
    }
}
