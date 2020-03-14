package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

        String result = "";

        char[] arr = value.toCharArray();


        for (int i = arr.length - 1; i >= 0; i--) {
            result+=arr[i];
        }

        return result;
    }
}

