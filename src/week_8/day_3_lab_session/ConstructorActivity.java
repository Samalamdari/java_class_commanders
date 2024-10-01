package week_8.day_3_lab_session;

public class ConstructorActivity {

    public static void main(String[] args) {

        Student firstStudent = new Student(
                "John",
                "Doe",
                28
        );

        Student secondStudent = new Student(
                "Tony",
                "Morphy",
                74
        );

        Student thirdStudent = new Student(
                "James",
                "Alexander"
        );

        firstStudent.printInfo();
        secondStudent.printInfo();
        thirdStudent.printInfo();

    }

}
