package com.codecool;

import java.io.Serializable;

public class Fruit extends Food implements Serializable {

    private int phIndex;

    Fruit(String name, int calories, int carboH, int protein, int fat, FoodType foodType, int phIndex) {
        super(name, calories, carboH, protein, fat, foodType);
        this.phIndex = phIndex;
    }

    public int getPhIndex() {
        return phIndex;
    }

    void setPhIndex(int phIndex) {
        this.phIndex = phIndex;
    }

    @Override
    public String toString() {
        return "Fruit{" +
            "phIndex=" + phIndex +
            '}';
    }
}
