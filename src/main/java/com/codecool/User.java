package com.codecool;

public class User {

    private String name;
    private int dailyCalorieNeeds;
    private int dailyCalorieTaken;

    public User(String name, int dailyCalorieNeeds, int dailyCalorieTaken) {
        this.name = name;
        this.dailyCalorieNeeds = dailyCalorieNeeds;
        this.dailyCalorieTaken = dailyCalorieTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailyCalorieNeeds() {
        return dailyCalorieNeeds;
    }

    public void setDailyCalorieNeeds(int dailyCalorieNeeds) {
        this.dailyCalorieNeeds = dailyCalorieNeeds;
    }

    public int getDailyCalorieTaken() {
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

    public int addCalorieTaken(int calories){
        this.dailyCalorieTaken += calories;
        return dailyCalorieTaken;
    }
}
