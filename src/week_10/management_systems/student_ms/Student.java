package week_10.management_systems.student_ms;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {

    // Attributes
    private final String studentID;
    private final String name;
    private final String email;
    private final String phoneNumber;
    protected List<Course> enrolledCourses;

    // Constructor
    public Student(String studentID, String name, String email, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getters
    public String getStudentID() {return this.studentID;}
    public String getName() {return this.name;}
    public String getEmail() {return this.email;}
    public String getPhoneNumber() {return this.phoneNumber;}
    public List<Course> getEnrolledCourses() {return this.enrolledCourses;}

    // Method to enroll in course
    public void enrollInCourse(Course course) {
        getEnrolledCourses().add(course);
    }

    // Method to remove course
    public void removeCourse(Course course) {
        getEnrolledCourses().remove(course);
    }

    // Method to calculate GPA
    public double calculateGPA() {
        double totalPoints = 0;
        int totalCredits = 0;
        for (Course course : enrolledCourses) {
            totalPoints += course.getCredits() * course.getGrade();
            totalCredits += course.getCredits();
        }
        return ( totalCredits > 0 ) ? totalPoints / totalCredits : 0.0;
    }

    // To String method
    @Override
    public String toString() {
        return "Student ID: " + getStudentID() + ", Name: " + getName();
    }

}
