package com.hillel.HomeWork_11;

public class FahrenheitToCelsius implements IConverter {

    public final String FAHRENHEITTOCELSIUST = "FTOC";

    @Override
    public double doubleConvert(double value, String type) {
        return value -40.0;
    }
}
