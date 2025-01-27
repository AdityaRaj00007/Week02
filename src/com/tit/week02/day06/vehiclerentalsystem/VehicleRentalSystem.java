package com.tit.week02.day06.vehiclerentalsystem;
import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("MP18 ZA 7123", "Sedan", 50, "ABC123");
        Vehicle bike = new Bike("MP04 AR 7123", "Sport", 20 , "XYZ785");
        Vehicle truck = new Truck("MH25 AG 7827", "Heavy Duty", 80, "ABC456");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
