package com.hillel.HW_12;

public class SpeedKmToMi implements IConverter {

    @Override
    public double doubleConvert(double value) {

        return value * 0.62139999999999995;
    }
}
