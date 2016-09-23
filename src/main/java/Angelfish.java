package main.java;

import static main.java.Food.SEAWEED;

public class Angelfish extends Fish {
    private Food foodType = SEAWEED;
    private int amountOfFoodPerFeed = 5;

    @Override
    public Food getFoodType() {
        return foodType;
    }

    @Override
    public int getAmountOfFoodPerFeed() {
        return amountOfFoodPerFeed;
    }
}