import java.util.Scanner;
class Employee {
    String name; 
    int id; 
    int salary; 

    // Constructor to initialize employee details
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display the details of the employee
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = input.nextLine();

        System.out.println("Enter ID: ");
        int id = input.nextInt();

        System.out.println("Enter the Salary: ");
        int salary = input.nextInt();

        // Create an Employee object with the provided details
        Employee employee = new Employee(name, id, salary);

        // Display the employee details
        employee.display();
        input.close();
    }
}
