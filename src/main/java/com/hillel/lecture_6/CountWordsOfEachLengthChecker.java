package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

        String newSentence = replaceSipbols(sentence);
        String[] split = newSentence.split(" ");
        int result = countLetters(split, wordLength);
        return result;
    }

    public static int countLetters(String[] split, int wordLength) {

        int counter = 0;
        for (int i = 0; i < split.length; i++) {

            if (split[i].length() == wordLength) {
                counter++;
        }
            }
        return counter;
    }

    public static String replaceSipbols(String sentence) {

        String s = sentence.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");

        return s;
    }

}
