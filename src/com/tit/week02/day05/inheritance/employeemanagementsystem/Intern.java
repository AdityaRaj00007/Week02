package com.tit.week02.day05.inheritance.employeemanagementsystem;

public class Intern extends Employee {
    protected String skills;

    @Override
    protected void displayDetails() {
        System.out.println("Name of Intern is: " + name + "\nId: " + id + "\nSalary: " + salary+ "\nSkill is: " + skills);
    }
}
