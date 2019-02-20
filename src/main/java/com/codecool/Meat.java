package com.codecool;

import java.io.Serializable;

public class Meat extends Food implements Serializable {

    private boolean healthyMeat;

    Meat(String name, int calories, int carboH, int protein, int fat, FoodType foodType, boolean healthyMeat) {
        super(name, calories, carboH, protein, fat, foodType);
        this.healthyMeat = healthyMeat;
    }

    public boolean isHealthyMeat() {
        return healthyMeat;
    }

    void setHealthyMeat(boolean healthyMeat) {
        this.healthyMeat = healthyMeat;
    }

    @Override
    public String toString() {
        return "Meat{" +
            "healthyMeat=" + healthyMeat +
            '}';
    }
}
