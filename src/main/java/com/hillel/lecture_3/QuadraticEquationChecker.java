package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double discr = (Math.pow(b, 2) - (4 * a * c));
        if (discr < 0) {
            result = "No roots on the set of real numbers!";
        }
        else if (discr == 0) {
            double x = - b /( 2 * a);
            result = "Two real, identical roots: [x1 && x2] = " + x;
        }
        else {
            double x1 = - (b - Math.sqrt(discr)) / (2 * a);
            double x2 = - (b + Math.sqrt(discr)) / (2 * a);

            result = String.format("Discriminant: %s, x1: %s, x2: %s", discr, x1, x2);
        }

        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
        }
        return result;
    }

}
