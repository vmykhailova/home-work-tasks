package com.hillel.HW_12;

public class MetersToInches implements IConverter{


    @Override
    public double doubleConvert(double value) throws ConverterCalculationException {
        if(value < 0)   {
            throw new ConverterCalculationException("number must be more then 0");
        }
        return value * 100 / 2.5;
    }
}
