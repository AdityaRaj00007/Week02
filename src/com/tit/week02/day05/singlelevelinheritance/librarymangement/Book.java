package com.tit.week02.day05.singlelevelinheritance.librarymangement;

public class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + "\nPublication Year: " + publicationYear);
    }
}

