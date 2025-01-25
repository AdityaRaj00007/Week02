package com.tit.week02.day05.inheritance.vehicletransportsystem;

public class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed , String fuelType , int loadCapacity){
        super(maxSpeed , fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        System.out.println("Max Speed of Car is: " + maxSpeed );
        System.out.println("Fuel Type: " + fuelType );
        System.out.println("Load Capacity: " + loadCapacity );
    }
}
