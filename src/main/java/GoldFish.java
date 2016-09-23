package main.java;

import static main.java.Food.WORM;

public class GoldFish  extends Fish {
    private Food foodType = WORM;
    private int amountOfFoodPerFeed = 2;

    @Override
    public Food getFoodType() {
        return foodType;
    }

    @Override
    public int getAmountOfFoodPerFeed() {
        return amountOfFoodPerFeed;
    }
}
