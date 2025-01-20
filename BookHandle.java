import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private double price;
    Book(){
    System.out.println("You are in Default Constructors ");
    }
    // Parameterized Constructor Constructor to initialize book details
    Book(String title , String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("You are in Parameterized Constructor ");
    }
    // Display method to display the details
    void display(){
        if(title==null){
            System.out.println("Object value not Initialized");
        }
        else{
            System.out.println("Title of Book is " + title + "is written by" + author + " which priced at " + price);
        }
    }
}    
class BookHandle{
   public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the name of Author: ");
    String author = input.nextLine();

    System.out.print("Enter the title of Book: ");
    String title = input.nextLine();

    System.out.print("Enter the price of Book: ");
    double price = input.nextDouble();
    
    Book book1 = new Book();// this will call default constructor
    book1.display();//this will call the display method and print object is not initialised
    Book book2 = new Book(title, author, price);
    book2.display();
    
    input.close();
   }
}