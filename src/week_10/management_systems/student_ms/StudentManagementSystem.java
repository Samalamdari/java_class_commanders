package week_10.management_systems.student_ms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagementSystem {

    private final List<Student> students;
    private final List<Course> courses;
    private final Map<String, Student> studentMap;
    private final Map<String, Course> courseMap;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        studentMap = new HashMap<>();
        courseMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        studentMap.put(student.getStudentID(), student);
    }

    public void addCourse(Course course) {
        courses.add(course);
        courseMap.put(course.getCourseId(), course);
    }

    public Student getStudentById(String studentId) {
        return studentMap.get(studentId);
    }

    public Course getCourseById(String courseId) {
        return courseMap.get(courseId);
    }

    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = getStudentById(studentId);
        Course course = getCourseById(courseId);
        if (student != null && course != null) {
            student.enrollInCourse(course);
        }
    }

    public void removeStudentFromCourse(String studentId, String courseId) {
        Student student = getStudentById(studentId);
        Course course = getCourseById(courseId);
        if (student != null && course != null) {
            student.removeCourse(course);
        }
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printAllCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

}

