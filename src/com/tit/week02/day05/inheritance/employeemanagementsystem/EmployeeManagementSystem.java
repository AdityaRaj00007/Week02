package com.tit.week02.day05.inheritance.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        Developer developer1 = new Developer();
        Intern intern1 = new Intern();
        manager1.name = "Aditya";
        manager1.id = 07;
        manager1.salary = 1000000;
        manager1.teamSize = 10;
        manager1.displayDetails();

        developer1.name = "Aadarsh";
        developer1.id = 01;
        developer1.salary = 200000;
        developer1.programmingLanguage = "Java";
        developer1.displayDetails();

        intern1.name = "Ankit";
        intern1.id = 18;
        intern1.salary = 10000;
        intern1.skills = "Cloud";
        intern1.displayDetails();
    }
}
