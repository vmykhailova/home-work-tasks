package com.hillel.HW_12;

public class KilogramsToPounds implements IConverter {


    @Override
    public double doubleConvert(double value) {
        return value * 2.20462;
    }
}
