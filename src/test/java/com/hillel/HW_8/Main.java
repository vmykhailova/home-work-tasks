package com.hillel.HW_8;

public class Main {

    public static void main(String[] args) {

        FractionNumbers Fraction1 = new FractionNumbers(1, 2);
        FractionNumbers Fraction2 = new FractionNumbers(1, 2);

        Fraction1.multiply(Fraction2);
        System.out.println(Fraction1);

        Fraction1.divide(Fraction2);
        System.out.println(Fraction1);

        Fraction1.plus(Fraction2);
        System.out.println(Fraction1);

        Fraction1.minus(Fraction2);
        System.out.println(Fraction1);
    }
}
