package com.tit.week02.day05.hybridinheritance.vehiclemanagementsystem;
public class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + "\nMax Speed: " + maxSpeed + " km/h");
    }
}
