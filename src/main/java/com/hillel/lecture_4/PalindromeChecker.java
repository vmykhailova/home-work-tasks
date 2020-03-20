package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public static boolean isPalindrome(String value) {

        char[] arr = value.toCharArray();
        char[] arr2 = arreyRevers(arr);
        boolean result = isPalendrom (arr, arr2);

        return result;
    }

    public static boolean isPalendrom (char[] arr, char[] arr2) {

        for (int j = 0; j < arr.length; j++) {
            if (arr2[j] != arr[j]) {
            return false;
            }
        }
        return true;

    }

    public static char[] arreyRevers(char[] arr) {

        char[] arr2 = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];

        }
        return arr2;
    }
}


