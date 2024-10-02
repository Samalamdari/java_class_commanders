package week_9.day_2.activities;

public class Student extends Person {

    // Variables
    private final int studentID;

    private static final String className = "Commanders";

    // Constructor
    public Student(String firstName, String lastName, int age, int studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
    }

    // Private Methods
//    private void setStudentID(int studentID) {this.studentID = studentID;}

    // Public Methods
    public int getStudentID() {return studentID;}
    public String getClassName() { return className; }

    @Override
    public String toString() {
        return "Student { " +
                "firstName = '" + getFirstName() + '\'' +
                ", lastName = '" + getLastName() + '\'' +
                ", age = " + getAge()  + '\'' +
                "studentID = " + getStudentID()   + '\'' +
                "className = " + getClassName()  + '\'' +
                '}';
    }
}


