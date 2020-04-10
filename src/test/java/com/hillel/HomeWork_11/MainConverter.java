package com.hillel.HomeWork_11;

public class MainConverter {

    public static void main(String[] args) {

        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        System.out.println(celsiusToFahrenheit.doubleConvert(10.0, celsiusToFahrenheit.CELSIUSTOFAHRENHEIT));

        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();
        System.out.println(celsiusToKelvin.doubleConvert(10.0, celsiusToKelvin.CELSIUSTOKELVIN));

        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
        System.out.println(fahrenheitToCelsius.doubleConvert(50.0, fahrenheitToCelsius.FAHRENHEITTOCELSIUST));

        InchesToMeters inchesToMeters = new InchesToMeters();
        System.out.println(inchesToMeters.doubleConvert(50.0, inchesToMeters.INCHESTOMETERS));

        KilogramsToPounds kilogramsToPounds = new KilogramsToPounds();
        System.out.println(kilogramsToPounds.doubleConvert(10.0, kilogramsToPounds.KILOGRAMSTOPOUNDS));

        KilometresToMiles kilometresToMiles = new KilometresToMiles();
        System.out.println(kilometresToMiles.doubleConvert(10.0, kilometresToMiles.KILOMETERSTOMILES));

        MetersToInches metersToInches = new MetersToInches();
        System.out.println(metersToInches.doubleConvert(5.0, metersToInches.METERSTOINCHES));

        MilesToKilometres milesToKilometres = new MilesToKilometres();
        System.out.println(milesToKilometres.doubleConvert(10.0, milesToKilometres.MILESTOKILOMETERS));

        PoundsToKilograms poundsToKilograms = new PoundsToKilograms();
        System.out.println(poundsToKilograms.doubleConvert(25.0, poundsToKilograms.POUNDSTOKILOGRAMS));

        SpeedKmToMi speedKmToMi = new SpeedKmToMi();
        System.out.println(speedKmToMi.doubleConvert(10.0, speedKmToMi.SPEEDKMTOMI));

        SpeedMiToKm speedMiToKm = new SpeedMiToKm();
        System.out.println(speedMiToKm.doubleConvert(10.0, speedMiToKm.SPEEDMITOKM));
    }
}
