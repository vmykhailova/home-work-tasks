package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

        return getRevertsArray(value);
    }

    public String getRevertsArray (String value) {

        char[] arr = value.toCharArray();
        String rev = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            rev +=arr[i];
        }
        return rev;

    }
}

