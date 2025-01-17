import java.util.Scanner;
class Book {
    String title; 
    String author; 
    int price; 

    // Constructor to initialize the book's details
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the book's details
    void display() {
        System.out.println("Title of Book: " + title);
        System.out.println("Author of Book: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookHandle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name of the Book: ");
        String name = input.nextLine();

        System.out.println("Enter the Name of the Author: ");
        String author = input.nextLine();

        System.out.println("Enter the Price of the Book: ");
        int price = input.nextInt();

        // Create a Book object with the provided details
        Book book = new Book(name, author, price);

        // Display the book's details
        book.display();

        
        input.close();
    }
}
