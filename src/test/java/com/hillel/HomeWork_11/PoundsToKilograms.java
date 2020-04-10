package com.hillel.HomeWork_11;

public class PoundsToKilograms implements IConverter {

    public final String POUNDSTOKILOGRAMS = "PTOKG";

    @Override
    public double doubleConvert(double value, String type) {
        return value / 2.2046;
    }
}
