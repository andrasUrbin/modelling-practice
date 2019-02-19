package com.codecool;

public abstract class Food{

    private String name;
    private int calories;
    private int carboH;
    private int protein;
    private int fat;
    private FoodType foodType;

    public Food(String name, int calories, int carboH, int protein, int fat, FoodType foodType) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarboH() {
        return carboH;
    }

    public void setCarboH(int carboH) {
        this.carboH = carboH;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
