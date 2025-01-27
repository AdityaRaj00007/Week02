package com.tit.week02.day06.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {
    private int workingHours;
    private String department;
    FullTimeEmployee(int employeeId, String name, double baseSalary , int workingHours) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + 200 * workingHours;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Total Salary : " + calculateSalary());
        System.out.println("Department: " + getDepartmentDetails());
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
