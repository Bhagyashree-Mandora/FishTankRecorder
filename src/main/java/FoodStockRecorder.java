package main.java;

import java.util.List;

import static main.java.Food.SEAWEED;
import static main.java.Food.SNAIL;

public class FoodStockRecorder {

    List<List<Integer>> foodStockRecords;

    public FoodStockRecorder(List<List<Integer>> foodStockRecords){
        this.foodStockRecords = foodStockRecords;
    }

    public int findAverageFoodPerDay(Fish fish, int numberOfFish) {
//        System.out.println(fish.getFoodType());
        int totalFoodOfType = calculateTotalFoodOfType(fish.getFoodType().ordinal());
        int totalDays = getTotalDays();
//        return 0;
        return totalFoodOfType/(numberOfFish*totalDays);
    }

    private int getTotalDays() {
        return foodStockRecords.size();
    }

    private int calculateTotalFoodOfType(int foodType) {
        int totalFoodConsumed = 0;
        for (List<Integer> record : foodStockRecords ) {
            totalFoodConsumed += record.get(foodType);
        }
        return totalFoodConsumed;
    }

    public int findAverageNumberOfTimesFedPerDay(Fish fish, int numberOfFish) {
        return findAverageFoodPerDay(fish, numberOfFish)/(fish.getAmountOfFoodPerFeed());
    }
}
