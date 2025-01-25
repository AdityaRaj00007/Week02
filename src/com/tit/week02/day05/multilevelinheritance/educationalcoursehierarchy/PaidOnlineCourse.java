package com.tit.week02.day05.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    PaidOnlineCourse(String courseName , int duration , String platform , boolean isRecorded , int fee , int discount){
        super(courseName , duration , platform , isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("fee: " + fee + "\nDiscount: " + discount + "%");
    }
}
