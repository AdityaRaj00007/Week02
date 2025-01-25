package com.tit.week02.day05.hybridinheritance.restaurantmanagementsystem;
public class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nID: " + id);
    }
}
