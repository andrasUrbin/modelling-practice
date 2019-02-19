package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Veggie extends Food {

    private List<String> vitaminList;

    public Veggie(String name, int calories, int carboH, int protein, int fat, FoodType foodType) {
        super(name, calories, carboH, protein, fat, foodType);
        this.vitaminList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Veggie{" +
            "vitaminList=" + vitaminList +
            '}';
    }
}
