package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fridge{

    private int temperature = 10;
    private int numberOfItems = 0;
    private boolean isFridgeOn = false;
    private List<Food> listOfFood = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);



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

    public List<Food> addVeggie(List<Food> listOfFood){
        System.out.println("Putting your veggie into the fridge!");
        Veggie newVeggie = new Veggie(null, 0, 0, 0, 0, FoodType.Veggie, null);
        System.out.println("What's the veggie's name?");
        newVeggie.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newVeggie.setCalories(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many carboH does it have?");
        newVeggie.setCarboH(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many protein does it have?");
        newVeggie.setProtein(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many fat does it have?");
        newVeggie.setFat(scanner.nextInt());
        scanner.nextLine();
        System.out.println("What's the dominant vitamin in it?");
        newVeggie.setMostVitamin(scanner.nextLine());
        listOfFood.add(newVeggie);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
        return listOfFood;
    }

    public List<Food> addFruit(List<Food> listOfFood){
        System.out.println("Putting your fruit into the fridge!");
        Fruit newFruit = new Fruit(null, 0, 0, 0, 0, FoodType.Fruit, 6 );
        System.out.println("What's the fruit's name?");
        newFruit.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newFruit.setCalories(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many carboH does it have?");
        newFruit.setCarboH(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many protein does it have?");
        newFruit.setProtein(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many fat does it have?");
        newFruit.setFat(scanner.nextInt());
        scanner.nextLine();
        System.out.println("What's its ph index?");
        newFruit.setPhIndex(scanner.nextInt());
        scanner.nextLine();
        listOfFood.add(newFruit);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
        return listOfFood;
    }

    public List<Food> addMeat(List<Food> listOfFood){
        System.out.println("Putting your fruit into the fridge!");
        Meat newMeat = new Meat(null, 0, 0, 0, 0, FoodType.Fruit, true );
        System.out.println("What's the fruit's name?");
        newMeat.setName(scanner.nextLine());
        System.out.println("How many calories does it have?");
        newMeat.setCalories(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many carboH does it have?");
        newMeat.setCarboH(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many protein does it have?");
        newMeat.setProtein(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How many fat does it have?");
        newMeat.setFat(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Is it a healthy meat?");
        newMeat.setHealthyMeat(scanner.nextBoolean());
        scanner.nextLine();
        listOfFood.add(newMeat);
        System.out.println("Your item is added to the fridge!");
        for(Food food : getListOfFood()){
            System.out.println(food.getName());
        }
        this.numberOfItems = getNumberOfItems() + 1;
        return listOfFood;
    }

    public List<Food> removeFood(List<Food> listOfFood, User user){
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
        return listOfFood;
    }
}
