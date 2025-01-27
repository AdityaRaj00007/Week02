package com.tit.week02.day06.hospitalPatientManagement;
import java.util.ArrayList;

public class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int numberOfDays;
    private ArrayList<String> records;

    public InPatient(String patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public String viewRecords() {
        return "Medical Records: " + String.join(", ", records);
    }
}
