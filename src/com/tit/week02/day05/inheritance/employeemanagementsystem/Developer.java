package com.tit.week02.day05.inheritance.employeemanagementsystem;

public class Developer extends Employee {
    protected String programmingLanguage;

    protected void displayDetails() {
        System.out.println("Name of Developer is: " + name + "\nID: " + id + "\nSalary: " + salary+ "\nProgramming Language is: " + programmingLanguage);
    }
}
