package com.tit.week02.day05.hybridinheritance.vehiclemanagementsystem;
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model X", 250, 100);
        PetrolVehicle bmw = new PetrolVehicle("BMW Y Series", 240, 60);

        tesla.displayInfo();
        tesla.charge();
        System.out.println();

        bmw.displayInfo();
        bmw.refuel();
        System.out.println();
    }
}
