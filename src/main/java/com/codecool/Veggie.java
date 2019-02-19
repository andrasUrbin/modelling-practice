package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Veggie extends Food {

    private String mostVitamin;

    public Veggie(String name, int calories, int carboH, int protein, int fat, FoodType foodType, String mostVitamin) {
        super(name, calories, carboH, protein, fat, foodType);
        this.mostVitamin = mostVitamin;
    }

    public String getMostVitamin() {
        return mostVitamin;
    }

    public void setMostVitamin(String mostVitamin) {
        this.mostVitamin = mostVitamin;
    }

    @Override
    public String toString() {
        return "Veggie{" +
            "mostVitamin=" + mostVitamin +
            '}';
    }
}
