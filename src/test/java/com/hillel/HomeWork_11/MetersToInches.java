package com.hillel.HomeWork_11;

public class MetersToInches implements IConverter {

    public final String METERSTOINCHES = "MTOI";

    @Override
    public double doubleConvert(double value, String type) {
        return value * 100 / 2.5;
    }
}
