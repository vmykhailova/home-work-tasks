package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {
        String result = word + ", ";
        char[] chars = word.toCharArray();

        for (int i = 0; i < word.length() - 1; i++) {

            char temp = chars[0];
            for (int j = 0; j < chars.length - 1; j++) {
                chars[j] = chars[j + 1];
            }
            chars[chars.length - 1] = temp;
            for (int q = 0; q < chars.length; q++) {
                result += chars[q];
            }
            result = result + ", ";
        }
        result = result.substring(0, result.length() - 2);

        return result;
    }
}
