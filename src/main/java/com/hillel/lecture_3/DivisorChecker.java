package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {

        String result = "";

        if (divisor % number == 0) {
            result = getPositiveAnswer (number, divisor);
        } else {
            result = getNegativeveAnswer (number, divisor);
        }

        return result;
    }

    public String getPositiveAnswer (int number, int divisor) {
        return "The number " + number + " is divisor of the number " + divisor;
    }

    public String getNegativeveAnswer (int number, int divisor) {
        return  "The number " + number + " is not divisor of the number " + divisor;
    }

}
