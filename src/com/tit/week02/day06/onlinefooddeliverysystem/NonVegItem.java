package com.tit.week02.day06.onlinefooddeliverysystem;
public class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double ADDITIONAL_CHARGE = 20.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity() + ADDITIONAL_CHARGE;
        totalPrice -= totalPrice * discount / 100;
        return totalPrice;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}
