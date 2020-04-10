package com.hillel.HomeWork_11;

public class CelsiusToFahrenheit implements IConverter {

    public final String CELSIUSTOFAHRENHEIT = "CTOF";

    @Override
    public double doubleConvert(double value, String type) {
        return value + 40.0;
    }
}
