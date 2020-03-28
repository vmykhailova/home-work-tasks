package com.hillel.HW_8;

public class FractionNumbers {

    private int numerator;
    private int denominator;

    public FractionNumbers(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("The denominator cannot be equal to 0");
            System.exit(0);
        }
        this.denominator = denominator;
    }

    public static FractionNumbers multiply(FractionNumbers first, FractionNumbers second) {
        FractionNumbers result = new FractionNumbers(0, 1);

        result.setNumerator(first.getNumerator() * second.getNumerator());
        result.setDenominator(first.getDenominator() * second.getDenominator());

        return result;
    }

    public static FractionNumbers divide(FractionNumbers first, FractionNumbers second) {
        FractionNumbers result = new FractionNumbers(0, 1);

        result.setNumerator(first.getNumerator() * second.getDenominator());
        result.setDenominator(first.getDenominator() * second.getNumerator());

        return result;

    }

    public static FractionNumbers plus(FractionNumbers first, FractionNumbers second) {
        FractionNumbers result = new FractionNumbers(0, 1);

        if (first.getDenominator() == second.getDenominator()) {
            result.setNumerator(first.getNumerator() + second.getNumerator());
            result.setDenominator(first.getDenominator());
            return result;
        }

        result.setNumerator((first.getNumerator() * second.getDenominator()) + (second.getNumerator() * first.getDenominator()));
        result.setDenominator(first.getDenominator() * second.getDenominator());
        return result;
    }

    public static FractionNumbers minus(FractionNumbers first, FractionNumbers second) {
        FractionNumbers result = new FractionNumbers(0, 1);

        if (first.getDenominator() == second.getDenominator()) {
            result.setNumerator(first.getNumerator() - second.getNumerator());
            result.setDenominator(first.getDenominator());
            return result;
        }

        result.setNumerator((first.getNumerator() * second.getDenominator()) - (second.getNumerator() * first.getDenominator()));
        result.setDenominator(first.getDenominator() * second.getDenominator());
        return result;
    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

}

