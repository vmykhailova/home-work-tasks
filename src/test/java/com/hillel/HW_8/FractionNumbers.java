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

    public  FractionNumbers multiply(FractionNumbers fraction) {
        this.setNumerator(this.getNumerator() * fraction.getNumerator());
        this.setDenominator(this.getDenominator() * fraction.getDenominator());

        return this;
    }

    public FractionNumbers divide(FractionNumbers fraction) {

        this.setNumerator(this.getNumerator() * fraction.getDenominator());
        this.setDenominator(this.getDenominator() * fraction.getNumerator());

        return this;

    }

    public FractionNumbers plus(FractionNumbers fraction) {

        if (this.getDenominator() == fraction.getDenominator()) {
            this.setNumerator(this.getNumerator() + fraction.getNumerator());
            this.setDenominator(this.getDenominator());
            return this;
        }

        this.setNumerator((this.getNumerator() * fraction.getDenominator()) + (fraction.getNumerator() * this.getDenominator()));
        this.setDenominator(this.getDenominator() * fraction.getDenominator());
        return this;
    }

    public FractionNumbers minus(FractionNumbers fraction) {

        if (this.getDenominator() == fraction.getDenominator()) {
            this.setNumerator(this.getNumerator() - fraction.getNumerator());
            this.setDenominator(this.getDenominator());
            return this;
        }

        this.setNumerator((this.getNumerator() * fraction.getDenominator()) - (fraction.getNumerator() * this.getDenominator()));
        this.setDenominator(this.getDenominator() * fraction.getDenominator());
        return this;
    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

}

