import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String gender;
    // Parameterized Constructor Constructor to initialize person details
    Person(String name , int age , String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Copy constructor to copy previous object value
    Person(Person p){
       this.name = p.name;
       this.age = p.age;
       this.gender = p.gender;
       System.out.println("yor are in copy constructor ");
    }
    void display(){
        System.out.println("Name of person is " + name + " is " + age + " Year old" + " is " + gender);
    }

    
}
public class CopyPersonAttributes {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter the name of person ");
       String name = input.nextLine();

       System.out.println("Enter the age of person ");
       int age = input.nextInt();

       System.out.println("Enter the gender of person ");
       String gender = input.next();

       Person person1 = new Person(name, age, gender);
       person1.display();
       Person person2 = new Person(person1);
       person2.display();

    }
}
