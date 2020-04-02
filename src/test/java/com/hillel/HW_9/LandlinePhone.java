package com.hillel.HW_9;

import java.util.Objects;

public class LandlinePhone extends Phone {

    private String color;
    private String model;

    public LandlinePhone(String provider, String type, String OS, int number, String color, String model) {
        super(provider, type, OS, number);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String changeMelody (int code) {
        String melody = "DinDon";
    switch (code) {

        case 1:
            melody = "DinDon";
            break;
        case 2:
            melody = "Dzzzzz";
            break;
        case 3:
            melody = "Trin-Trin";
            break;
    }
        return melody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandlinePhone that = (LandlinePhone) o;
        return color.equals(that.color) &&
                model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }
}
