package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class LetterRemovalChecker {


    @Step
    public String removeLetter(String sentence, String letterFoRemove) {


        String result = sentence.replaceAll(letterFoRemove, "");

        return result;
    }
}
