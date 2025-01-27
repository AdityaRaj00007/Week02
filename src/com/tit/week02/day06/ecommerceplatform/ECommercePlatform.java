package com.tit.week02.day06.ecommerceplatform;

import java.util.ArrayList;

public class ECommercePlatform {
    public static double calculateFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }
        return product.getPrice() + tax - discount;
    }

    public static void main(String[] args) {
        Product electronics = new Electronics("A74855", "Laptop", 75000, 2);
        Product clothing = new Clothing("B78001", "Shirt", 2000, "L");
        Product groceries = new Groceries("C58001", "Milk", 50);

        ArrayList<Product> products = new ArrayList<>();
        products.add(electronics);
        products.add(clothing);
        products.add(groceries);


        for (Product product : products) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + product.calculateDiscount());

            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
                System.out.println("Tax: " + tax);
            } else {
                System.out.println("Tax: Not Applicable");
            }

            System.out.println("Final Price: " + calculateFinalPrice(product));
            System.out.println();
        }
    }
}
