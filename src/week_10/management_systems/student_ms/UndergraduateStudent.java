package week_10.management_systems.student_ms;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String studentId, String name, String email, String phoneNumber) {
        super(studentId, name, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Undergraduate " + super.toString();
    }
}

