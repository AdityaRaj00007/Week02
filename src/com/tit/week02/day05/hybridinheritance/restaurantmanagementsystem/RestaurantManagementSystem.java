package com.tit.week02.day05.hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Aditya Raj Gupta", 1);
        Waiter waiter = new Waiter("Darshan Yadav", 2);

        chef.displayInfo();
        System.out.println();

        waiter.displayInfo();
        System.out.println();
    }
}
