package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public int linearEquation(int a, int b) {

//        TODO implements result
        int result = 0;

        if (a == 0) {
            System.out.println("no solution");
        } else if (b == 0) {
            System.out.println("x = 0");
        } else
            result = + - b / a;

        return result;
    }
}
