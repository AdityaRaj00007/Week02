class Book{
    private static String libraryName = "Aditya Library"; // Static variable shared among all instance
    private String title;
    private String author;
    private final int isbn ; // To ensure the unique identifier of a book cannot be changed
    // Method to to display library name
    static void displayLibraryName(){
        System.out.println(libraryName);
    }
    // parameterised Constructor
    Book(String title , String author , int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    void display(){
        // Check if an object is an instance of the book class
        if(this instanceof Book) {
            System.out.println("Library Name: " + libraryName + "\nTitle of Book is: " + title + "\nWhich is written by: " + author + "\n Having isbn number: " + isbn);
        }
        else{
            System.out.println("Invaild");
        }
    }

}
public class LibraryManagementSystem {
    public static void main(String[] args) {
     Book book1 = new Book("Java Programming" , "Aditya" , 789);
     Book book2 = new Book("C++ Programming" , "Aadarsh" ,789 );
     Book.displayLibraryName();
     book1.display();
     book2.display();
    }
}
