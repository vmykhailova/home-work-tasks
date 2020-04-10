package com.hillel.HomeWork_11;

public class KilogramsToPounds implements IConverter {

    public final String KILOGRAMSTOPOUNDS = "KGTOP";

    @Override
    public double doubleConvert(double value, String type) {
        return value * 2.20462;
    }
}
