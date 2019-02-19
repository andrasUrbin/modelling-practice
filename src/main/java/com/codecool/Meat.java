package com.codecool;

public class Meat extends Food {

    private boolean healthyMeat;

    public Meat(String name, int calories, int carboH, int protein, int fat, FoodType foodType, boolean healthyMeat) {
        super(name, calories, carboH, protein, fat, foodType);
        this.healthyMeat = healthyMeat;
    }

    public boolean isHealthyMeat() {
        return healthyMeat;
    }

    public void setHealthyMeat(boolean healthyMeat) {
        this.healthyMeat = healthyMeat;
    }

    @Override
    public String toString() {
        return "Meat{" +
            "healthyMeat=" + healthyMeat +
            '}';
    }
}
