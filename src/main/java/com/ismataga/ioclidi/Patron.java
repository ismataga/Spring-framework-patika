package com.ismataga.ioclidi;

public class Patron implements PatronInterFace{

    @Override
    public String surum(String data) {
        return "surum " + data;
    }
}
