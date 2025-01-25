package com.tit.week02.day05.inheritance.vehicletransportsystem;

abstract public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed , String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    abstract void displayInfo();
}
