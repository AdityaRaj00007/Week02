package com.tit.week02.day05.hybridinheritance.restaurantmanagementsystem;
public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        performDuties();
    }
}
