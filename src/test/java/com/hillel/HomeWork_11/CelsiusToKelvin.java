package com.hillel.HomeWork_11;

public class CelsiusToKelvin implements IConverter {

    public final String CELSIUSTOKELVIN = "CTOK";

    @Override
    public double doubleConvert(double value, String type) {

        return value + 273.16;
    }
}
