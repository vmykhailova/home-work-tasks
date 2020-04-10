package com.hillel.HomeWork_11;

public class KilometresToMiles implements IConverter {

    public final String KILOMETERSTOMILES = "KLTOML";

    @Override
    public double doubleConvert(double value, String type) {
        return value * 0.6215040397762586;
    }
}
