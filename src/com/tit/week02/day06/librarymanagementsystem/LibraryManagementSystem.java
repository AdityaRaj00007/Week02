package com.tit.week02.day06.librarymanagementsystem;
import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("M416", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M762", "National Geographic", "Various Authors");
        LibraryItem dvd = new Dvd("DP28", "Inception", "Christopher Nolan");

        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem();
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println();
        }
    }
}
