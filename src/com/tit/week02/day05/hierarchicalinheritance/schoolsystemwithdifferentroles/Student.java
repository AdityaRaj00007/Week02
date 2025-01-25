package com.tit.week02.day05.hierarchicalinheritance.schoolsystemwithdifferentroles;
public class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student\nGrade: " + grade);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        displayRole();
    }
}
