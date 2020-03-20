package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */

public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";

        result = Integer.toHexString(value);
    result = result.toUpperCase();
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {
        String digits = "0123456789ABCDEF";
        value = value.toUpperCase();
        int val = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
