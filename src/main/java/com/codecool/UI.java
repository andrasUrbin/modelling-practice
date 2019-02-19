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
        menu(user, fridge, listOfFood);
    }

    private void menu(User user, Fridge fridge, List<Food> listOfFood){
        int menuOption;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("What would you like to do in the kitchen?");
            System.out.println("1. See how many calories I've eaten today!");
            System.out.println("2. See what's in the fridge!");
            System.out.println("3. Put something in the fridge!");
            System.out.println("4. Take out something from the fridge to eat!");
            System.out.println("0. Leave the kitchen!");
            menuOption = scanner.nextInt();
            scanner.nextLine();

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

                case 0:
                    System.out.printf("See you soon!");
                    System.exit(0);

            }
        }
    }
}
