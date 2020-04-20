package com.hillel.HW_12;

public class MainConverter {

    public static void main(String[] args) throws ConverterCalculationException {

        ConverterFactory converterFactory = new ConverterFactory();
        try {
            IConverter converter = converterFactory.createConverter(ConverterType.CELSIUSTOFAHRENHEIT);
            System.out.println(converter.doubleConvert(-10.0));
        } catch (ConverterNotExistsException exception){
            System.out.println("No such converter");
        }

    }
}
