package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    @Step
    public String checkNumber(int number) {

        String result = "";

        result = number >= 50 ? "PASS" : "FAIL";

        System.out.println("DONE");


        return result;
    }
}
