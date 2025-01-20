class Patient {

    private static String hospitalName = "City Hospital"; // Shared among all patients
    private static int totalPatients = 0;

    private final int patientID; // To uniquely identify each patient
    private String name;
    private int age;
    private String ailment;
    // Parameterised Constructor to fill patient details
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++totalPatients;
    }
    // method to get total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        // Check if an object is an instance of Patient class
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("This object is not a Patient.");
        }
    }

}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Aadarsh Gupta", 21, "Fever");
        Patient patient2 = new Patient("Ankit Gangwani", 28, "Fracture");
        Patient patient3 = new Patient("Darshan Yadav", 40, "Cold");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();
        patient3.displayPatientDetails();

        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}