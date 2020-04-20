package com.hillel.HW_12;

public class MilesToKilometres implements IConverter{

    @Override
    public double doubleConvert(double value) {

        return value * 1.609;
    }
}
