package com.tit.week02.day06.librarymanagementsystem;
public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerDetails;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
        this.borrowerDetails = "";
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    public void setBorrowerDetails(String borrowerDetails) {
        this.borrowerDetails = borrowerDetails;
    }

    public String getBorrowerDetails() {
        return borrowerDetails;
    }
}
