package com.hillel.HomeWork_11;

public class FahrenheitToCelsius implements IConverter {


    @Override
    public double doubleConvert(double value) {
        return value -40.0;
    }
}
