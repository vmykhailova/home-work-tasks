package com.hillel.HomeWork_11;

public class InchesToMeters implements IConverter {

    public final String INCHESTOMETERS = "ITOM";

    @Override
    public double doubleConvert(double value, String type) {

        return value / 39.37;
    }
}
