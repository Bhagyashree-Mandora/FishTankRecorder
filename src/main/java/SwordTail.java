package main.java;

import static main.java.Food.SNAIL;

public class SwordTail  extends Fish {
    private Food foodType = SNAIL;
    private int amountOfFoodPerFeed = 3;

    @Override
    public Food getFoodType() {
        return foodType;
    }

    @Override
    public int getAmountOfFoodPerFeed() {
        return amountOfFoodPerFeed;
    }
}
