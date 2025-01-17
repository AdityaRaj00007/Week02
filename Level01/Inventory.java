import java.util.Scanner;
class Item {
    int itemCode; 
    String itemName;
    int price; 
    int quantity; 

    // Constructor to initialize item details
    Item(int itemCode, String itemName, int price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total cost of the item
    int totalCost() {
        return quantity * price;
    }

    // Method to display the total cost
    void display() {
        System.out.println("Total Cost for given quantity is: " + totalCost());
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item Code: ");
        int itemCode = input.nextInt();

        System.out.println("Enter item Name: ");
        String itemName = input.next();

        System.out.println("Enter the price: ");
        int price = input.nextInt();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        // Create an Item object with the provided details
        Item item = new Item(itemCode, itemName, price, quantity);

        // Display the total cost
        item.display();
        input.close();
    }
}
