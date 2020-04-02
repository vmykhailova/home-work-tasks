package com.hillel.HW_9;

public class Phone {

    private String provider;
    private String type;
    private String OS;
    private int number;

    public Phone(String provider, String type, String OS, int number ) {

        this.number = number;
        this.OS = OS;
        this.provider = provider;
        this.type = type;
    }


    public String getProvider() {
        return provider;
    }

    public String getType() {
        return type;
    }

    public String getOS() {
        return OS;
    }

    public int getNumber() {
        return number;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String call(){
        return "I am calling";
    }

    public String down(){
        return "Stop the calling";
    }
}
