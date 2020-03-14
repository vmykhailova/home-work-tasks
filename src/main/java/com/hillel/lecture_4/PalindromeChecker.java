package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

        boolean result = true;

        StringBuilder stringBuilder = new StringBuilder(value);
        stringBuilder.reverse();
        char[] arr = value.toCharArray();
        char[] arr2 = stringBuilder.toString().toCharArray();

        for (int j = 0; j < arr.length; j++) {
            if (arr2[j] != arr[j]) {
                result = false;
                break;
            }
        }

        return result;
    }
}

