package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

            int i = bitsInNumber(value);

            int bit;
            while ( --i >= 0 ){ bit = (value & (1 << i)) == 0 ? 0 : 1; System.out.print(bit);
            }

        int result = 0;

        result = Integer.parseInt(Integer.toBinaryString(value));

        return result;
    }
    public static int bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        } return res;
    }


    @Step
    public int fromBinaryToDecimal(int value) {

        String newValue = intToString (value);
        char[] chars = newValue.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = newValue.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                result += mult;
            }
            mult*=2;
        }
        return result;
    }

    public String intToString (int value) {
        return Integer.toString(value);
    }
}
