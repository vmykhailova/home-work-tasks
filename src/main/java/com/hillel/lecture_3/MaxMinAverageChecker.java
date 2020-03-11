package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        result = Math.max(a, b);
        result = Math.max(c, result);

        if (isNumberEqual(a, b, c)) {
            result = 0;
        }

        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        if (a != getMaxNumber(a, b, c) && a != getMinNumber(a, b, c)) {
            result = a;
        } else if (b != getMaxNumber(a, b, c) && b != getMinNumber(a, b, c)) {
            result = b;
        }else {
            result = c;
        }

        if (isNumberEqual(a, b, c)) {
            result = 0;
        }

        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;

        result = Math.min(a, b);
        result = Math.min(c, result);

        if (isNumberEqual(a, b, c)) {
            result = 0;
        }

        return result;
    }

    @Step
    public boolean isNumberEqual(int a, int b , int c) {

        if (a == b && a == c) {
            return true;
  }
        return false;
    }
}
