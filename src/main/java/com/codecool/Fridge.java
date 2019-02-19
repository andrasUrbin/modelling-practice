package com.codecool;

public class Fridge{

    public int temperature = 30;
    public int numberOfItems = 0;
    public boolean isFridgeOn = false;


    public void turnFridgeOn() {
        if (isFridgeOn == false) {
            System.out.println("Your fridge is on!");
            isFridgeOn = true;
        } else {
            System.out.println("Your fridge was already on!");
        }
    }

    public void makeFridgeColder() {
        temperature = temperature - 10;

        if (temperature < 10) {
            System.out.println("Your food is Frozen");
            isFridgeOn = false;
        }
    }

    public void makeFridgeWarmer() {
        temperature = temperature + 10;

        if (temperature > 55) {
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
}
