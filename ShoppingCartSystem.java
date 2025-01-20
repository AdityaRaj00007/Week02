class Product {
    private static double discount = 0.0; // Static variable shared among all instance
    private final int productID; // To ensure each product has a unique identifier that cannot be changed
    private String productName;
    private double price;
    private int quantity;
    private static int idCounter = 1; // To update the product quantity
    // Parameterised Constructor
    Product(String productName, double price, int quantity) {
        this.productID = idCounter++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    // Update Discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount < 0 || newDiscount > 100) {
            System.out.println("Invalid discount value. Discount must be between 0 and 100.");
        } else {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        }
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price After Discount: $" + calculateDiscountedPrice());
        } else {
            System.out.println("Invalid Product");
        }
    }
    // Calculate Discount Price
    private double calculateDiscountedPrice() {
        return price * (1 - discount / 100);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product.updateDiscount(10.0);
        Product product1 = new Product("Laptop", 1000.00, 2);
        Product product2 = new Product("Smartphone", 500.00, 5);
        Product product3 = new Product("Headphones", 150.00, 10);

        System.out.println("Product Details");
        product1.displayDetails();
        System.out.println();

        product2.displayDetails();
        System.out.println();

        product3.displayDetails();
        System.out.println();

        Product.updateDiscount(15.0);
        System.out.println("After Updating Discount");
        product1.displayDetails();
        System.out.println();

        product2.displayDetails();
        System.out.println();

        product3.displayDetails();
    }
}