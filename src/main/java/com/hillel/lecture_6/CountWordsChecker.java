package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {

        int result = 0;
        String[] split = sentence.split(" ");
        result = split.length;

        return result;
    }


}
