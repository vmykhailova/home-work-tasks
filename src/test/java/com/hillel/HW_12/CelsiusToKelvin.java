package com.hillel.HW_12;

public class CelsiusToKelvin implements IConverter {


    @Override
    public double doubleConvert(double value) {

        return value + 273.16;
    }
}
