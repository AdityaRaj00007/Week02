class Employee{
    private static  String companyName = "Capgemini"; // Static variable shared among all instance
    private String name;
    private final int id;  // To uniquely Indentify Elements
    private String designation;
    private static int totalEmployee = 0;
    // Parameterised Constructor
    Employee(String name , int id , String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }
     // Display total number of employee
     static void displayTotalEmployees(){
        System.out.println("Total Number of Employee is: " + totalEmployee);
    }
    void display(){
        if(this instanceof Employee) {
            System.out.println("Company Name is: " + companyName + "\nName: " + name + "\nid: " + id + "\nDesignation: " + designation);
        }
        else{
            System.out.println("Invaild Employee");
        }
    }


}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya" , 07 , "pune");
        Employee emp2 = new Employee("Aadarsh" , 01 , "pune");
        Employee emp3 = new Employee("Ankit" , 18 , "pune");
        Employee.displayTotalEmployees();
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
