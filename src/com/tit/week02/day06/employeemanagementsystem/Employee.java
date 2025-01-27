package com.tit.week02.day06.employeemanagementsystem;

abstract public class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId , String name , double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //getter
    int getEmployeeId(){
        return employeeId;
    }
    String getName(){
        return name;
    }
    double getBaseSalary(){
        return baseSalary;
    }
    //setter
    void setEmployeeId(){
        this.employeeId = employeeId;
    }
    void setName(){
        this.name = name;
    }
    void setBaseSalary(){
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void display(){
        System.out.println("Employee Id: " +  employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
