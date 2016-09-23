package main.java;

import java.util.List;

public class FoodStockRecorder {

    List<List<Integer>> foodStockRecords;

    public FoodStockRecorder(List<List<Integer>> foodStockRecords){
        this.foodStockRecords = foodStockRecords;
    }

    public int findAverageFoodPerDay(Fish fish, int numberOfFish) {
        int totalFoodOfType = calculateTotalFoodOfType(fish.getFoodType().ordinal());
        int totalDays = getTotalDays();
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
