package week_10.management_systems.student_ms;

public class CourseEnrollment {

    private final Student student;
    private final Course course;

    public CourseEnrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Enrollment: " + student.getName() + " enrolled in " + course.getCourseName();
    }
}

