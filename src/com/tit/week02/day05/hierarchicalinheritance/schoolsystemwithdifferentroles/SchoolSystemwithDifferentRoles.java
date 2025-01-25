package com.tit.week02.day05.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class SchoolSystemwithDifferentRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Aditya Raj Gupta", 35, "Mathematics");
        Student student = new Student("Aadarsh Gupta", 16, "10th Grade");
        Staff staff = new Staff("Ankit Gangwani", 40, "Librarian");

        teacher.displayInfo();
        System.out.println();

        student.displayInfo();
        System.out.println();

        staff.displayInfo();
        System.out.println();
    }
}
