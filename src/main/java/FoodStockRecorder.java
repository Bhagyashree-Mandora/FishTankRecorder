package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.Food.SEAWEED;
import static main.java.Food.SNAIL;
import static main.java.Food.WORM;

public class FoodStockRecorder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of Gold fish in the tank: ");
        int nGoldFish = Integer.valueOf(scanner.next());
        System.out.print("Enter total number of Sword Tail in the tank: ");
        int nSwordTail = Integer.valueOf(scanner.next());
        System.out.print("Enter total number of Angelfish in the tank: ");
        int nAngelfish = Integer.valueOf(scanner.next());

        List<Fish> fishesInTank = new ArrayList<>();
        for (int i = 0; i < nGoldFish; i++) {
            fishesInTank.add(new GoldFish());
        }

        for (int i = 0; i < nSwordTail; i++) {
            fishesInTank.add(new SwordTail());
        }

        for (int i = 0; i < nAngelfish; i++) {
            fishesInTank.add(new Angelfish());
        }

        List<List<Integer>> foodStockRecords = new ArrayList<>();
        List<Integer> day1Food = new ArrayList<>();
        day1Food.add(40);
        day1Food.add(120);
        day1Food.add(60);

        List<Integer> day2Food = new ArrayList<>();
        day2Food.add(60);
        day2Food.add(150);
        day2Food.add(90);

        List<Integer> day3Food = new ArrayList<>();
        day3Food.add(30);
        day3Food.add(90);
        day3Food.add(45);

        foodStockRecords.add(day1Food);
        foodStockRecords.add(day2Food);
        foodStockRecords.add(day3Food);

        Integer totalWormsConsumed = 0;
        Integer totalSnailsConsumed = 0;
        Integer totalSeaweedConsumed = 0;
        int totalDays = foodStockRecords.size();
        System.out.println(totalDays);

        for (List<Integer> record : foodStockRecords ) {
            totalWormsConsumed += record.get(WORM.ordinal());
            totalSnailsConsumed += record.get(SNAIL.ordinal());
            totalSeaweedConsumed += record.get(SEAWEED.ordinal());
        }

        

    }
}
