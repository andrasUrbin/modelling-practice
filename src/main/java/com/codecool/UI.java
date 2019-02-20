package com.codecool;

import java.io.*;
import java.util.*;

class UI{

    private static Scanner scanner = new Scanner(System.in);


    void createUser(){
        int caloriesNeeded;
        List<Food> listOfFood = new ArrayList<>();
        System.out.println("Welcome to the kitchen! What's your name?");
        User user = new User(null, 0,0);
        Veggie carrot = new Veggie("carrot", 30, 10, 5, 2, FoodType.Veggie, "C");
        Fruit apple = new Fruit("apple", 20, 8, 4, 3, FoodType.Fruit, 6);
        Meat pork = new Meat("pork", 100, 40, 25, 30, FoodType.Meat, true);
        listOfFood.add(carrot);
        listOfFood.add(apple);
        listOfFood.add(pork);
        Fridge fridge = new Fridge(10, 3, true, listOfFood);
        user.setName(scanner.nextLine());
        System.out.println("Welcome " + user.getName() + "\nHow many calories do you need for a day?");
        caloriesNeeded = inputInt();
        user.setDailyCalorieNeeds(caloriesNeeded);
        menu(user, fridge, listOfFood);
    }

    private void menu(User user, Fridge fridge, List<Food> listOfFood) {
        int menuOption;
        while(true){
            System.out.println("What would you like to do in the kitchen?");
            System.out.println("1. See how many calories I've eaten today!");
            System.out.println("2. See what's in the fridge!");
            System.out.println("3. Put something in the fridge!");
            System.out.println("4. Take out something from the fridge to eat!");
            System.out.println("5. Save your actual state!");
            System.out.println("6. Load previous save!");
            System.out.println("0. Leave the kitchen!");
            menuOption = inputInt();

            switch(menuOption){
                case 1:
                    System.out.println(user.getDailyCalorieTaken());
                    break;
                case 2:
                    for(Food food : fridge.getListOfFood()){
                        System.out.println(food.getName());
                    }
                    break;
                case 3:
                    System.out.println("What would you like to put in the fridge? ");
                    System.out.println("1. Some veggie? ");
                    System.out.println("2. Some fruit? ");
                    System.out.println("3. Some meat? ");
                    int subMenu = inputInt();
                    switch (subMenu){
                        case 1:
                            fridge.addVeggie(listOfFood);
                            break;
                        case 2:
                            fridge.addFruit(listOfFood);
                            break;
                        case 3:
                            fridge.addMeat(listOfFood);
                            break;
                    }
                    break;
                case 4:
                    fridge.removeFood(listOfFood, user);
                    break;
                case 5:
                    serialization(fridge, user);
                    break;
                case 6:
                    try {
                        FileInputStream fileIn = new FileInputStream("target/save.ser");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        fridge = (Fridge) in.readObject();
                        user = (User) in.readObject();
                        in.close();
                        fileIn.close();
                    } catch (IOException i) {
                        i.printStackTrace();
                        return;
                    } catch (ClassNotFoundException c) {
                        System.out.println("User class not found");
                        c.printStackTrace();
                        return;
                    }
                    System.out.println("Fridge class deserialized!\n");
                    System.out.println("What does the fridge contain?\n");
                    for(Food food : fridge.getListOfFood()){
                        System.out.println(food.getName());
                    }
                    System.out.println("\nUser class deserialized!\n");
                    System.out.println("User information: \n");
                    System.out.println("Username: " + user.getName());
                    System.out.println("User's calorie need: " + user.getDailyCalorieNeeds());
                    System.out.println("How many calories the user has already eaten today: " + user.getDailyCalorieTaken());
                    break;
                case 0:
                    System.out.printf("See you soon!");
                    System.exit(0);
                default:
                    System.out.println("Not an option, try again!");
            }
        }
    }

    private void serialization(Fridge fridge, User user){
        try {
            FileOutputStream fileOut = new FileOutputStream("target/save.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fridge);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in target/save.ser\n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    static int inputInt() {
        while (true) {
            System.out.println("Give an int input:");
            try {
                return scanner.nextInt();
            }catch (java.util.InputMismatchException e) {
                scanner.nextLine();
            }
        }
    }

    static boolean inputBool() {
        while (true) {
            System.out.println("Give a boolean input:");
            try {
                return scanner.nextBoolean();
            }catch (java.util.InputMismatchException e) {
                scanner.nextLine();
            }
        }
    }

}
