package com.tit.week02.day05.hierarchicalinheritance.schoolsystemwithdifferentroles;
public class Staff extends Person {
    String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println("Role: Staff\nPosition: " + position);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        displayRole();
    }
}
