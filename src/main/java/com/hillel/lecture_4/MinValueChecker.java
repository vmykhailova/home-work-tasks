package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

        int result = getMinValue(values);

        return result;
    }

    public int getMinValue (int[] values) {

        int min = values[0];
        for (int i = 1; i < values.length; i ++) {
            min = Math.min(min, values[i]);
        }
        return min;

    }

}


