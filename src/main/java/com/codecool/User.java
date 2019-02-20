package com.codecool;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int dailyCalorieNeeds;
    private int dailyCalorieTaken;

    User(String name, int dailyCalorieNeeds, int dailyCalorieTaken) {
        this.name = name;
        this.dailyCalorieNeeds = dailyCalorieNeeds;
        this.dailyCalorieTaken = dailyCalorieTaken;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDailyCalorieNeeds() {
        return dailyCalorieNeeds;
    }

    void setDailyCalorieNeeds(int dailyCalorieNeeds) {
        this.dailyCalorieNeeds = dailyCalorieNeeds;
    }

    int getDailyCalorieTaken() {
        return dailyCalorieTaken;
    }

    public void setDailyCalorieTaken(int dailyCalorieTaken) {
        this.dailyCalorieTaken = dailyCalorieTaken;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", dailyCalorieNeeds=" + dailyCalorieNeeds +
            ", dailyCalorieTaken=" + dailyCalorieTaken +
            '}';
    }

    void addCalorieTaken(int calories){
        this.dailyCalorieTaken += calories;
    }
}
