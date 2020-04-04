package com.hillel.HW_10;

public class CalculatorMain {

    public static void main(String[] args) {

        SimpleCulculator simpleCulculator = new SimpleCulculator();
        System.out.println("sum = " + simpleCulculator.plus(2,5));
        System.out.println("dif = " + simpleCulculator.minus(12,5));
        System.out.println("compos = " + simpleCulculator.multiply(10,5));
        System.out.println("quot = " + simpleCulculator.division(10,5));
        System.out.println("sqrt = " + simpleCulculator.sqrt(4));
        EngeneerCalculator engeneerCalculator = new EngeneerCalculator();
        System.out.println("sqrt = " + engeneerCalculator.pow(5, 2));
    }
}
