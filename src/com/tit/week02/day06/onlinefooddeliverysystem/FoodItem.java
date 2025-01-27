package com.tit.week02.day06.onlinefooddeliverysystem;
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item Name: " + itemName + "\nPrice: " + price + "\nQuantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}
