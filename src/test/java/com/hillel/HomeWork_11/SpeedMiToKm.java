package com.hillel.HomeWork_11;

public class SpeedMiToKm implements IConverter {

    public final String SPEEDMITOKM = "SPMITOKM";

    @Override
    public double doubleConvert(double value, String type) {

        return value * 1.60926939169617;
    }
}
