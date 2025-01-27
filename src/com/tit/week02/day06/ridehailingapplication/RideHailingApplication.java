package com.tit.week02.day06.ridehailingapplication;
import java.util.ArrayList;

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("MP18 AC 7897", "Aditya", 10.0, "Bhopal");
        Vehicle bike = new Bike("MP18 AO 9897", "Ankit", 5.0, "Ujjain");
        Vehicle auto = new Auto("MP18 AC 7885", "Aadarsh", 7.0, "Indore");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 500.0; // example distance

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            ((GPS) vehicle).updateLocation("Mumbai");
            System.out.println("Updated Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println();
        }
    }
}
