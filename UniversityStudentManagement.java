class Student {
    private static String universityName = "RGPV"; // University name will we shared among all students
    private static int totalStudents = 0;

    private final int rollNumber; // To uniquely identify each Students
    private String name;
    private String grade;
    // Parameterised Constructor
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    // Method to display Total Students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayDetails() {
        // Check if a given object is an instance of the Student class
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student");
        }
    }

    public void updateGrade(String newGrade) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for Roll Number: " + rollNumber);


    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Aditya", 07, "A");
        Student student2 = new Student("Aadarsh", 01, "B");
        Student student3 = new Student("Ankit", 18, "C");

        Student.displayTotalStudents();

        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
        System.out.println();

        student3.displayDetails();
        System.out.println();

        student2.updateGrade("A+");
        System.out.println();

        student2.displayDetails();
    }
}