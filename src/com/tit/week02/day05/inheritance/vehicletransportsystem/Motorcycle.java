package com.tit.week02.day05.inheritance.vehicletransportsystem;

public class Motorcycle extends Vehicle{
    String engine;

    Motorcycle(int maxSpeed , String fuelType , String engine){
        super(maxSpeed , fuelType);
        this.engine = engine;
    }
    void displayInfo() {
        System.out.println("Max Speed of Car is: " + maxSpeed );
        System.out.println("Fuel Type: " + fuelType );
        System.out.println("Engine: " + engine );
    }
}
