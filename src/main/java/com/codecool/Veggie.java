package com.codecool;

import java.io.Serializable;

public class Veggie extends Food implements Serializable {

    private String mostVitamin;

    Veggie(String name, int calories, int carboH, int protein, int fat, FoodType foodType, String mostVitamin) {
        super(name, calories, carboH, protein, fat, foodType);
        this.mostVitamin = mostVitamin;
    }

    public String getMostVitamin() {
        return mostVitamin;
    }

    void setMostVitamin(String mostVitamin) {
        this.mostVitamin = mostVitamin;
    }

    @Override
    public String toString() {
        return "Veggie{" +
            "mostVitamin=" + mostVitamin +
            '}';
    }
}
