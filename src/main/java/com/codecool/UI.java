package com.codecool;

import java.util.*;

public class UI {

    private Scanner scanner = new Scanner(System.in);


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
        caloriesNeeded = scanner.nextInt();
        scanner.nextLine();
        user.setDailyCalorieNeeds(caloriesNeeded);
        printMenu(user, fridge, listOfFood);
    }

    private void printMenu(User user, Fridge fridge, List<Food> listOfFood){
        int menuOption;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("What would you like to do in the kitchen?");
            System.out.println("1. See how many calories I've eaten today!");
            System.out.println("2. See what's in the fridge!");
            System.out.println("3. Put something in the fridge!");
            System.out.println("4. Take out something from the fridge to eat!");
            System.out.println("5. List the items available in the fridge!");
            System.out.println("0. Leave the kitchen!");
            menuOption = scanner.nextInt();

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
                    int subMenu = scanner.nextInt();
                    scanner.nextLine();
                    switch (subMenu){
                        case 1:
                            System.out.println("Putting your veggie into the fridge!");
                            Veggie newVeggie = new Veggie(null, 0, 0, 0, 0, FoodType.Veggie, null);
                            System.out.println("What's the veggies name?");
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
                            fridge.addFood(listOfFood, newVeggie);
                            System.out.println("Your item is added to the fridge!");
                            for(Food food : fridge.getListOfFood()){
                                System.out.println(food.getName());
                            }
                            break;
                    }

                case 0:
                    System.out.printf("See you soon!");
                    System.exit(0);

            }
        }
    }
}
