import java.util.Scanner;

class Circle{
    private double radius;
    Circle(){
        System.out.println("You are in Default Constructor ");
    }
    // Parameterized Constructor Constructor to initialize radius and calling default constructor
    Circle(double radius){
        this();// call the default constructor
        this.radius = radius;
        System.out.println("You are in Parameterized Constructor ");
    }
    void display(){
        System.out.println("The radius of circle is " + radius);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Radius of Circle ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
        input.close();
    }
}
