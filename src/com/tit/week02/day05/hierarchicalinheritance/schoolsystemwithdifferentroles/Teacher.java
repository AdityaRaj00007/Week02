package com.tit.week02.day05.hierarchicalinheritance.schoolsystemwithdifferentroles;
public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher\nSubject: " + subject);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        displayRole();
    }
}
