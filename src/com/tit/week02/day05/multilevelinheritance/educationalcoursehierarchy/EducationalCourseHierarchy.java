package com.tit.week02.day05.multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
    PaidOnlineCourse paidOnline = new PaidOnlineCourse("Java" , 5 , "YouTube" , true , 15000 , 10);
    paidOnline.displayInfo();
    }
}
