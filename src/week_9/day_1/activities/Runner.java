package week_9.day_1.activities;

public class Runner {

    public static void main(String[] args) {

        Student stdOne = new Student(
                "John",
                "Doe",
                "123",
                "Student",
                "Commanders",
                'A'
        );

        var obj = new GeneralInformation(
                "John",
                "Doe",
                "123",
                "Student"
        );

        stdOne.printInfo();

    }

}
