package com.hillel.HW_12;

public class FahrenheitToCelsius implements IConverter{


    @Override
    public double doubleConvert(double value) {
        return value -40.0;
    }
}
