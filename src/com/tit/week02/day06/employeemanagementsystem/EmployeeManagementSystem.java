package com.tit.week02.day06.employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee(07 , "Aditya" , 30000 , 100);
        Employee employee1 = fullTime;
        fullTime.assignDepartment("IT");
        PartTimeEmployee partTime = new PartTimeEmployee(18 , "Ankit" , 0 , 50);
        Employee employee2 = partTime;
        partTime.assignDepartment("IT");

        ArrayList<Employee>employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        for(var emp : employees){
            emp.display();
            System.out.println();
        }

    }
}
