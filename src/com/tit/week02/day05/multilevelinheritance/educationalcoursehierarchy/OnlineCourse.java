package com.tit.week02.day05.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends  Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName , int duration , String platform , boolean isRecorded){
        super(courseName , duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + "\nisRecorded: " + isRecorded);
    }
}
