package com.hillel.HomeWork_11;

public class SpeedKmToMi implements IConverter {

    public final String SPEEDKMTOMI = "SPKMTOMI";

    @Override
    public double doubleConvert(double value, String type) {

        return value * 0.62139999999999995;
    }
}
