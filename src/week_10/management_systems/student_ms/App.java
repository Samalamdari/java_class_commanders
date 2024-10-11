package week_10.management_systems.student_ms;

public class App {

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();

        Student student1 = new GraduateStudent(
                "S1",
                "Alice",
                "alice@mail.com",
                "1234567890"
        );

        Student student2 = new UndergraduateStudent(
                "S2",
                "Bob",
                "bob@mail.com",
                "0987654321"
        );

        Course course1 = new MandatoryCourse(
                "C1",
                "Math 101",
                3
        );

        Course course2 = new ElectiveCourse(
                "C2",
                "History 101",
                2
        );

        sms.addStudent(student1);
        sms.addStudent(student2);

        sms.addCourse(course1);
        sms.addCourse(course2);

        sms.enrollStudentInCourse("S1", "C1");
        sms.enrollStudentInCourse("S2", "C2");

        sms.printAllStudents();
        sms.printAllCourses();

        System.out.println("GPA of Alice: " + student1.calculateGPA() );
    }

}
