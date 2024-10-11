package week_10.management_systems.student_ms;

public abstract class Course {

    private final String courseId;
    private final String courseName;
    private final int credits;
    private double grade;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getter
    public String getCourseId() {return courseId;}
    public String getCourseName() {return courseName;}
    public int getCredits() {return credits;}
    public double getGrade() {return grade;}

    // Setter
    public void setGrade(double grade) {this.grade = grade;}

    @Override
    public String toString() {
        return courseName + " (" + courseId + "), Credits: " + credits;
    }

}

