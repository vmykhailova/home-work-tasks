package com.hillel.lecture_4;
/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void main(String[] args) {

        double x = 0;
        while (x <= 360) {
            System.out.println("sin(" + x + ") = " + Math.sin(x));
            x += 10;
        }

    }

}
