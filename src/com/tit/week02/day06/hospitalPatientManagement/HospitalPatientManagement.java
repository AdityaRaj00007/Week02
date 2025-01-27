package com.tit.week02.day06.hospitalPatientManagement;
import java.util.ArrayList;
class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("P001", "Ankit Gangwani", 45, 2000.0, 5);
        Patient outpatient = new OutPatient("P002", "Darshan Yadav", 30, 500.0);

        if (inpatient instanceof MedicalRecord) {
            MedicalRecord medicalRecordInPatient = (MedicalRecord) inpatient;
            medicalRecordInPatient.addRecord("Diagnosis: Pneumonia");
            medicalRecordInPatient.addRecord("Treatment: Antibiotics");
        }

        if (outpatient instanceof MedicalRecord) {
            MedicalRecord medicalRecordOutPatient = (MedicalRecord) outpatient;
            medicalRecordOutPatient.addRecord("Diagnosis: Flu");
            medicalRecordOutPatient.addRecord("Treatment: Rest and hydration");
        }

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(inpatient);
        patients.add(outpatient);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println(medicalRecord.viewRecords());
            }
            System.out.println();
        }
    }
}
