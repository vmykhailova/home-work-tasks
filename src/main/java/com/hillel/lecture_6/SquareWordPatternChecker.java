package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {
        char [] chars = word.toCharArray();
       String result = "";
        String tempWord = "";
        for(int j =0; j<chars.length;j++){
        char [] arr = shift(chars);

        for(int i =0; i<arr.length;i++){
            tempWord += arr[i];
        }
        result+=tempWord;
        }
        return result;
    }

    public static char[] shift (char[] chars){


        char[] newChars = new char[chars.length];

        newChars[0] = chars[chars.length - 1];
        System.arraycopy(chars, 0, newChars, 1, chars.length - 1);

            return newChars;
    }


}
