package com.tit.week02.day05.inheritance.employeemanagementsystem;

public class Manager extends Employee {
    protected int teamSize;

    @Override
    protected void displayDetails() {
        System.out.println("Name of Manager is: " + name + "\nID: " + id + "\nSalary: " + salary+ "\nTeamSize is: " + teamSize);
    }
}
