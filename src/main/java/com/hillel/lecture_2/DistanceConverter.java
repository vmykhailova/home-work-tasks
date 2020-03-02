package com.hillel.lecture_2;

import io.qameta.allure.Step;

import java.math.BigDecimal;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = meters * 100 / 2.54;
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = inches * 2.54 / 100.0;
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = miles * 1.609;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = kilometres * 0.621371192237334;
        return result;
    }
}
