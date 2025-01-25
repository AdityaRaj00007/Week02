package com.tit.week02.day05.inheritance.vehicletransportsystem;

public class Car extends Vehicle{
    int seatCapacity;

    Car(int maxSpeed , String fuelType , int seatCapacity){
        super(maxSpeed , fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    void displayInfo() {
        System.out.println("Max Speed of Car is: " + maxSpeed );
        System.out.println("Fuel Type: " + fuelType );
        System.out.println("Seat Capacity: " + seatCapacity );
    }
}
