package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Fridge{

    private int temperature = 10;
    private int numberOfItems = 0;
    private boolean isFridgeOn = false;
    private List<Food> listOfFood = new ArrayList<>();


    public void turnFridgeOn() {
        if (!isFridgeOn) {
            System.out.println("Your fridge is on!");
            isFridgeOn = true;
        } else {
            System.out.println("Your fridge was already on!");
        }
    }

    public void makeFridgeColder() {
        temperature = temperature - 10;

        if (temperature < 0) {
            System.out.println("Your food is Frozen");
            isFridgeOn = false;
        }
    }

    public void makeFridgeWarmer() {
        temperature = temperature + 10;

        if (temperature > 30) {
            System.out.println("Your food is spoiled fridge way to warm... ");
            isFridgeOn = false;
        }
    }

    public void printInfo() {

        if (isFridgeOn) {
            System.out.println("Your fridge is on!");
        } else {
            System.out.println("Your fridge is off!");
        }
        System.out.println("Your fridge is at a temperature of " + temperature + " degrees.");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public boolean isFridgeOn() {
        return isFridgeOn;
    }

    public void setFridgeOn(boolean fridgeOn) {
        isFridgeOn = fridgeOn;
    }

    public List<Food> getListOfFood() {
        return listOfFood;
    }

    public void setListOfFood(List<Food> listOfFood) {
        this.listOfFood = listOfFood;
    }

    public Fridge(int temperature, int numberOfItems, boolean isFridgeOn, List<Food> listOfFood) {
        this.temperature = temperature;
        this.numberOfItems = numberOfItems;
        this.isFridgeOn = isFridgeOn;
        this.listOfFood = listOfFood;
    }

    public void addFood(List<Food> listOfFood, Food food){
        listOfFood.add(food);
        this.numberOfItems = getNumberOfItems() + 1;
    }

    public void removeFood(List<Food> listOfFood, Food food){
        listOfFood.remove(food);
        this.numberOfItems = getNumberOfItems() - 1;
    }
}
