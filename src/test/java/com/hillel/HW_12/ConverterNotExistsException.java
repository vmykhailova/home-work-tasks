package com.hillel.HW_12;

public class ConverterNotExistsException extends Exception {
    String message;

    public ConverterNotExistsException(String message) {
        this.message = message;
    }
}
