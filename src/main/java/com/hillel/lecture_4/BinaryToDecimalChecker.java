package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {


        int result = 0;

        result = Integer.parseInt(Integer.toBinaryString(value));

        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;

        result = Integer.parseInt(String.valueOf(value),2);

        return result;
    }
}
