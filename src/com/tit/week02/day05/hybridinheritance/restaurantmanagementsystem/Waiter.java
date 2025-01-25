package com.tit.week02.day05.hybridinheritance.restaurantmanagementsystem;
public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        performDuties();
    }
}
