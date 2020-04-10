package com.hillel.HomeWork_11;

public class SpeedMiToKm implements IConverter {


    @Override
    public double doubleConvert(double value) {

        return value * 1.60926939169617;
    }
}
