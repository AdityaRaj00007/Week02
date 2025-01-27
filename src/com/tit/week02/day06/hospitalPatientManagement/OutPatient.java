package com.tit.week02.day06.hospitalPatientManagement;
import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
