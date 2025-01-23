import java.util.ArrayList;
import java.util.List;

class Student {
    // Attributes
    private String name;
    private String rollNumber;
    private ArrayList<Course> courseList;

    // Constructor to initialize student object
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.courseList = new ArrayList<>();
    }

    // Method to get all courses
    public List<Course> getCourses() {
        return courseList;
    }

    // Method to add courses
    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student name - " + name + "\nRoll number - " + rollNumber);
    }
}

// Class to demonstrate Course
class Course {
    // Instance variable
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor to initialize course object
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll student in course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course name - " + courseName);
        System.out.println("Enrolled students:");
        for (Student student : enrolledStudents) {
            student.displayStudent();
        }
    }
}

// Class to demonstrate School
class School {
    // Attribute
    private String schoolName;
    private List<Student> studentList;

    // Constructor to initialize school object
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.studentList = new ArrayList<>();
    }

    // Method to add student to school and enroll in a course
    public void addStudent(Student student, Course course) {
        studentList.add(student);
        course.enrollStudent(student);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Set school name
        School school1 = new School("TIT International School");
        
        // Creating course objects
        Course course1 = new Course("Computer Network");
        Course course2 = new Course("Operating System");
        Course course3 = new Course("Database");
        
        // Creating student objects
        Student student1 = new Student("Aditya", "07");
        Student student2 = new Student("Ankit", "18");

        // Enrolling students in courses
        school1.addStudent(student1, course1);
        school1.addStudent(student1, course2);
        school1.addStudent(student2, course3);
        
        // Displaying course details
        course1.displayCourse();
        course2.displayCourse();
        course3.displayCourse();
    }
}
