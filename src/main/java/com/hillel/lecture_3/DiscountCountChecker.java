package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

        double result = 0.0;
        if (price > 1000.0) {
            result = (price - (price * 0.15));
            System.out.println("the sum is " + result);

        } else {
            System.out.println("no discount");
        }

        return result;
    }
}
