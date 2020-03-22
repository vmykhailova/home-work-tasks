package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {


        String result = word.toUpperCase();


        return result;
    }

    @Step
    public String toLowerCase(String word) {

        String result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

        String result = "";



        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

        String result = "";
        String s2 = sentence.substring(0, 1).toUpperCase();
        for(int i = 1;i<sentence.length(); i++){
            if (" ".equals(sentence.substring(i-1,i))){
                s2+=sentence.substring(i,i+1).toUpperCase();
            } else {
                s2+=sentence.substring(i,i+1);
            }
        }
        result = s2;
        return result;
    }
}
