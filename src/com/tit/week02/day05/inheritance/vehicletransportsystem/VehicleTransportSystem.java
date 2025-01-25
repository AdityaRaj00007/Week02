package com.tit.week02.day05.inheritance.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car(125, "Petrol", 5),
                new Truck(80, "Diesel", 78545),
                new Motorcycle(300, "Petrol", "2000cc")
        };
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            System.out.println();
        }

    }
}
