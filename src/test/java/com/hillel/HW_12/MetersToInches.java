package com.hillel.HW_12;

public class MetersToInches implements IConverter{


    @Override
    public double doubleConvert(double value) {
        return value * 100 / 2.5;
    }
}
