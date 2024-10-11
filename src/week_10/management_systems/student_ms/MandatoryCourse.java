package week_10.management_systems.student_ms;

public class MandatoryCourse extends Course {

    public MandatoryCourse(String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
    }

    @Override
    public String toString() {
        return "Mandatory Course: " + super.toString();
    }

}

