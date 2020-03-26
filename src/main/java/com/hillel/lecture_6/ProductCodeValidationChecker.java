package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

        boolean isValid = false;

        String[] arr1 = code.split(" ");
        String productCode = arr1[0];

        int result = Integer.parseInt(arr1[1]);
        int[] numbers = new int[6];
        char[] chars = productCode.toCharArray();

        if (!isCodeValid(chars)){
            return false;
        }
        int j = 0;

        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i])) {
                numbers[j] = Character.getNumericValue(chars[i]);
                j++;
            }
        }

        int a = numbers[0]*10 + numbers[1];
        int b = numbers[2]*10 + numbers[3];
        int c = numbers[4]*10 + numbers[5];

        if(a*b*c == result){
            isValid = true;
        }
        return isValid;
    }

    private static boolean isCodeValid(char [] code){
        for (int i = 0; i < code.length; i++) {
            if(!Character.isDigit(code[i])){
                if (code[i] == Character.toLowerCase(code[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
