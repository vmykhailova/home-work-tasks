package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int result = 0;
        result = values[0];

    for (int i = 1; i < values.length; i ++) {
        result = Math.min(result, values[i]);
    }

        return result;
    }

}
