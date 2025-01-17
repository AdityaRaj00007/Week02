import java.util.Scanner;
class MobilePhone {
    String brand; 
    String model; 
    int price; 

    // Constructor to initialize the mobile phone details
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display the details of the mobile phone
    void display() {
        System.out.println("Mobile Phone Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mobile Phone Brand: ");
        String brand = input.next();

        System.out.println("Enter Model: ");
        String model = input.next();

        System.out.println("Enter Price: ");
        int price = input.nextInt();

        // Create a MobilePhone object with the provided details
        MobilePhone mobile = new MobilePhone(brand, model, price);

        // Display the details of the mobile phone
        mobile.display();
        input.close();
    }
}
