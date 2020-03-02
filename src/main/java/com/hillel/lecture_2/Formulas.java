package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 1.1 * Math.pow(Math.E, -x) + (Math.abs(Math.cos(Math.sqrt(Math.PI * x)))) - 3 / 8;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 1 / 3 * (Math.sqrt(Math.abs(Math.sin(x)))) * (Math.cbrt(Math.pow(Math.E, 0.12 * x)));
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = (2 * Math.PI * x) - (Math.abs(Math.sin(Math.sqrt(10.5 * x)))) * (1 / (Math.cbrt(Math.pow(x, 2)) + 1 / 7));
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = Math.log((Math.sqrt(Math.abs(2 - x))) + 1.2) * (1 / (2 + (Math.pow(Math.E, - x)))) + Math.cbrt(2 / x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13
        return result;
    }
}
