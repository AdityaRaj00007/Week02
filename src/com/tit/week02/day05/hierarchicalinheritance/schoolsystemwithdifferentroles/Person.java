package com.tit.week02.day05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public abstract class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
    abstract void displayRole();
}
