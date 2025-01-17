import java.util.Scanner;
class Circle {
    double radius;

    // Constructor to initialize the radius of the circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the area and circumference of the circle
    void display() {
        System.out.println("Area of Circle is: " + calculateArea());
        System.out.println("Circumference of Circle is: " + calculateCircumference());
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter the Radius of Circle: ");
        double radius = input.nextDouble();

        // Create a Circle object and display its area and circumference
        Circle circle = new Circle(radius);
        circle.display();

        input.close();
    }
}
