class Vehicle {

    private static double registrationFee; // Shared for all vehicles
    private final String registrationNumber; // To uniquely identify each vehicle
    private String ownerName;
    private String vehicleType;
   // Parameterised Constructor
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Method to update Registration Fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    // Method to get Registration fee
    public static double getRegistrationFee() {
        return registrationFee;
    }

    public void displayRegistrationDetails() {
        // Check if an object belongs to the Vehicle Class before displaying its registration
        if (this instanceof Vehicle) {
            System.out.println("Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("This object is not a Vehicle.");
        }
    }
}

class VehicleRegistrationSystem {

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(500.00);

        Vehicle car = new Vehicle("Aditya Raj Gupta", "Car", "CAR123");
        Vehicle bike = new Vehicle("Darshan Yadav", "Bike", "BIKE456");

        car.displayRegistrationDetails();
        bike.displayRegistrationDetails();
    }
}