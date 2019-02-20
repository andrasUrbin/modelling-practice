package com.codecool;

import java.io.Serializable;

public abstract class Food implements Serializable {

    private String name;
    private int calories;
    private int carboH;
    private int protein;
    private int fat;
    private FoodType foodType;

    Food(String name, int calories, int carboH, int protein, int fat, FoodType foodType) {
        this.name = name;
        this.calories = calories;
        this.carboH = carboH;
        this.protein = protein;
        this.fat = fat;
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
            "name='" + name + '\'' +
            ", calories=" + calories +
            ", carboH=" + carboH +
            ", protein=" + protein +
            ", fat=" + fat +
            ", foodType=" + foodType +
            '}';
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getCalories() {
        return calories;
    }

    void setCalories(int calories) {
        this.calories = calories;
    }

    int getCarboH() {
        return carboH;
    }

    void setCarboH(int carboH) {
        this.carboH = carboH;
    }

    int getProtein() {
        return protein;
    }

    void setProtein(int protein) {
        this.protein = protein;
    }

    int getFat() {
        return fat;
    }

    void setFat(int fat) {
        this.fat = fat;
    }

    FoodType getFoodType() {
        return foodType;
    }

    void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
