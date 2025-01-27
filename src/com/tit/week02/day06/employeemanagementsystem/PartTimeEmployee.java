package com.tit.week02.day06.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements  Department{
    private int workingHours;
    private String department;
    PartTimeEmployee(int employeeId, String name, double baseSalary , int workingHours) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
    return 200 * workingHours;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Darpartment: " + getDepartmentDetails());
    }
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
