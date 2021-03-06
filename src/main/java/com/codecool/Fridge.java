package com.codecool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fridge implements Serializable {

    private int temperature = 10;
    private int numberOfItems = 0;
    private boolean isFridgeOn = false;
    private List<Food> listOfFood = new ArrayList<>();
    private transient Scanner scanner = new Scanner(System.in);



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

    private int getNumberOfItems() {
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

    List<Food> getListOfFood() {
        return listOfFood;
    }

    public void setListOfFood(List<Food> listOfFood) {
        this.listOfFood = listOfFood;
    }

    Fridge(int temperature, int numberOfItems, boolean isFridgeOn, List<Food> listOfFood) {
        this.temperature = temperature;
        this.numberOfItems = numberOfItems;
        this.isFridgeOn = isFridgeOn;
        this.listOfFood = listOfFood;
    }

    void addVeggie(List<Food> listOfFood){
        System.out.println("Putting your veggie into the fridge!");
        Veggie newVeggie = new Veggie(null, 0, 0, 0, 0, FoodType.Veggie, null);
        System.out.println("What's the veggie's name?");
        newVeggie.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newVeggie.setCalories(UI.inputInt());
        System.out.println("How many carboH does it have?");
        newVeggie.setCarboH(UI.inputInt());
        System.out.println("How many protein does it have?");
        newVeggie.setProtein(UI.inputInt());
        System.out.println("How many fat does it have?");
        newVeggie.setFat(UI.inputInt());
        System.out.println("What's the dominant vitamin in it?");
        newVeggie.setMostVitamin(scanner.nextLine());
        listOfFood.add(newVeggie);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
    }

    void addFruit(List<Food> listOfFood){
        System.out.println("Putting your fruit into the fridge!");
        Fruit newFruit = new Fruit(null, 0, 0, 0, 0, FoodType.Fruit, 6 );
        System.out.println("What's the fruit's name?");
        newFruit.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newFruit.setCalories(UI.inputInt());
        System.out.println("How many carboH does it have?");
        newFruit.setCarboH(UI.inputInt());
        System.out.println("How many protein does it have?");
        newFruit.setProtein(UI.inputInt());
        System.out.println("How many fat does it have?");
        newFruit.setFat(UI.inputInt());
        System.out.println("What's its ph index?");
        newFruit.setPhIndex(UI.inputInt());
        listOfFood.add(newFruit);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
    }

    void addMeat(List<Food> listOfFood){
        System.out.println("Putting your meat into the fridge!");
        Meat newMeat = new Meat(null, 0, 0, 0, 0, FoodType.Meat, true );
        System.out.println("What's the meat's name?");
        newMeat.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newMeat.setCalories(UI.inputInt());
        System.out.println("How many carboH does it have?");
        newMeat.setCarboH(UI.inputInt());
        System.out.println("How many protein does it have?");
        newMeat.setProtein(UI.inputInt());
        System.out.println("How many fat does it have?");
        newMeat.setFat(UI.inputInt());
        System.out.println("Is it a healthy meat?");
        newMeat.setHealthyMeat(UI.inputBool());
        listOfFood.add(newMeat);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
    }

    void removeFood(List<Food> listOfFood, User user){
        Food tempFood = null;
        for(Food food : listOfFood){
            System.out.println(food.getName());
        }
        System.out.println("What would you like to eat?");
        String toRemove = scanner.nextLine();
        for (Food food : listOfFood) {
            if(food.getName().equals(toRemove)){
                tempFood = food;
            }
        }
        listOfFood.remove(tempFood);
        user.addCalorieTaken(tempFood.getCalories());


        System.out.println("You've eaten " + toRemove + " and you have " + user.getDailyCalorieTaken() + " calories now!");
        this.numberOfItems = getNumberOfItems() - 1;
    }
}
