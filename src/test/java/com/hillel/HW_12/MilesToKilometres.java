package com.hillel.HW_12;

public class MilesToKilometres implements IConverter{

    @Override
    public double doubleConvert(double value) throws ConverterCalculationException {
        if(value < 0)   {
            throw new ConverterCalculationException("number must be more then 0");
        }
        return value * 1.609;
    }
}
