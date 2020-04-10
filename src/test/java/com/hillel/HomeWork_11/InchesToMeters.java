package com.hillel.HomeWork_11;

public class InchesToMeters implements IConverter {


    @Override
    public double doubleConvert(double value) {

        return value / 39.37;
    }
}
