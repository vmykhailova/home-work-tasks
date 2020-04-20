package com.hillel.HW_12;

public class KilometresToMiles implements IConverter {


    @Override
    public double doubleConvert(double value) {
        return value * 0.6215040397762586;
    }
}
