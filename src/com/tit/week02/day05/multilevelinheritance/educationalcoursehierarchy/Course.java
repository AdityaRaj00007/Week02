package com.tit.week02.day05.multilevelinheritance.educationalcoursehierarchy;

public class Course {
    String coureName;
    int duration;

    Course(String coureName , int duration ){
        this.coureName = coureName;
        this.duration = duration;
    }

    void displayInfo(){
        System.out.println("Course Name: " + coureName + "\nDuration: " + duration);
    }
}
