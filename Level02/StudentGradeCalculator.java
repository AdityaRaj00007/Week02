import java.util.Scanner;
class Student {
    String name; 
    int rollNumber; 
    int marks[];

    // Constructor to initialize student details
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade of the student based on percentage
    char grade() {
        int sum = 0; // Sum of marks
        int percentage; // Percentage of total marks
        char grade; // Grade of the student

        // Calculate the sum of marks
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        // Calculate percentage
        percentage = sum / marks.length;

        // Determine grade based on percentage
        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 80) {
            grade = 'B';
        } else if (percentage > 60) {
            grade = 'C';
        } else if (percentage > 40) {
            grade = 'D';
        } else {
            grade = 'F'; // Failing grade for percentages <= 40
        }

        return grade;
    }

    // Method to display the student's grade
    void display() {
        System.out.println(name + " has Grade " + grade());
    }
}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        String name = input.nextLine();

        System.out.println("Enter the Roll Number of the Student: ");
        int rollNumber = input.nextInt();

        System.out.println("Enter the Number of Subjects: ");
        int numberOfSubjects = input.nextInt();

        int[] marks = new int[numberOfSubjects];

        // Get marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks of Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Create a Student object and calculate/display the grade
        Student student = new Student(name, rollNumber, marks);
        student.display();

        input.close();
    }
}
