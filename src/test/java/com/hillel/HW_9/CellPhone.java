package com.hillel.HW_9;

import java.util.Objects;

public class CellPhone extends Phone {

    private boolean bluetooth;
    private String version;

    public CellPhone(String provider, String type, String OS, int number, boolean bluetooth, String version) {
        super(provider, type, OS, number);
        this.bluetooth = bluetooth;
        this.version = version;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public String getVersion() {
        return version;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean connectionToWiFi(boolean isSignal) {
        return isSignal ? true : false;
    }

    public String call(int number){
        return "I am calling to" + number;
    }

    public String down(){
        return "Tap the cancel button";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellPhone cellPhone = (CellPhone) o;
        return bluetooth == cellPhone.bluetooth &&
                version.equals(cellPhone.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bluetooth, version);
    }
}
