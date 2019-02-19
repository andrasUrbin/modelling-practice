package com.codecool;

public class Fruit extends Food {

    private int phIndex;

    public Fruit(String name, int calories, int carboH, int protein, int fat, FoodType foodType, int phIndex) {
        super(name, calories, carboH, protein, fat, foodType);
        this.phIndex = phIndex;
    }

    public int getPhIndex() {
        return phIndex;
    }

    public void setPhIndex(int phIndex) {
        this.phIndex = phIndex;
    }

    @Override
    public String toString() {
        return "Fruit{" +
            "phIndex=" + phIndex +
            '}';
    }
}
