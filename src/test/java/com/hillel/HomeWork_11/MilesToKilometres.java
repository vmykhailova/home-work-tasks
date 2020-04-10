package com.hillel.HomeWork_11;

public class MilesToKilometres implements IConverter {

    public final String MILESTOKILOMETERS = "MLTOKL";

    @Override
    public double doubleConvert(double value, String type) {

        return value * 1.609;
    }
}
