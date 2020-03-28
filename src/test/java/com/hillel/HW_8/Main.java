package com.hillel.HW_8;

public class Main {

    public static void main(String[] args) {

        FractionNumbers Fraction1 = new FractionNumbers(3, 5);
        FractionNumbers Fraction2 = new FractionNumbers(4, 5);

        FractionNumbers result = FractionNumbers.multiply(Fraction1,Fraction2);
        System.out.println(result);

        FractionNumbers result2 = FractionNumbers.divide(Fraction1,Fraction2);
        System.out.println(result2);

        FractionNumbers result3 = FractionNumbers.plus(Fraction1,Fraction2);
        System.out.println(result3);

        FractionNumbers result4 = FractionNumbers.minus(Fraction1,Fraction2);
        System.out.println(result4);
    }
}
