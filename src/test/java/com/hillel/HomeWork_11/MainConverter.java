package com.hillel.HomeWork_11;

public class MainConverter {

    public static void main(String[] args) {

        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        System.out.println(celsiusToFahrenheit.doubleConvert(10.0));

        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();
        System.out.println(celsiusToKelvin.doubleConvert(10.0));

        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
        System.out.println(fahrenheitToCelsius.doubleConvert(50.0));

        InchesToMeters inchesToMeters = new InchesToMeters();
        System.out.println(inchesToMeters.doubleConvert(50.0));

        KilogramsToPounds kilogramsToPounds = new KilogramsToPounds();
        System.out.println(kilogramsToPounds.doubleConvert(10.0));

        KilometresToMiles kilometresToMiles = new KilometresToMiles();
        System.out.println(kilometresToMiles.doubleConvert(10.0));

        MetersToInches metersToInches = new MetersToInches();
        System.out.println(metersToInches.doubleConvert(5.0));

        MilesToKilometres milesToKilometres = new MilesToKilometres();
        System.out.println(milesToKilometres.doubleConvert(10.0));

        PoundsToKilograms poundsToKilograms = new PoundsToKilograms();
        System.out.println(poundsToKilograms.doubleConvert(25.0));

        SpeedKmToMi speedKmToMi = new SpeedKmToMi();
        System.out.println(speedKmToMi.doubleConvert(10.0));

        SpeedMiToKm speedMiToKm = new SpeedMiToKm();
        System.out.println(speedMiToKm.doubleConvert(10.0));
    }
}
