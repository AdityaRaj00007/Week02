package com.tit.week02.day06.onlinefooddeliverysystem;
import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 1);

        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getItemDetails());
            if (foodItem instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItem;
                discountableItem.applyDiscount(10); // Apply 10% discount
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price: " + foodItem.calculateTotalPrice());
            System.out.println();
        }
    }
}
