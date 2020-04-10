package com.hillel.HomeWork_11;

public class PoundsToKilograms implements IConverter {

    @Override
    public double doubleConvert(double value) {
        return value / 2.2046;
    }
}
