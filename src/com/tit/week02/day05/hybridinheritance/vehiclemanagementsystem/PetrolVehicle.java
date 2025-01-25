package com.tit.week02.day05.hybridinheritance.vehiclemanagementsystem;
public class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling\nFuel capacity: " + fuelCapacity + " liters");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
