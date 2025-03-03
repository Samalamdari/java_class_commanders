package test_and_practice_for_interview.object_oriented_programing_oop;

public class Runner {

    public static void main(String[] args) {

        EmployeeTwo empOne = new EmployeeTwo(
                "John",
                "Doe",
                "12/10/1980",
                40,
                "TekSchool"
        );
        empOne.printEmployeeInfo();

        System.out.println(" *** *** *** *** *** *** *** *** *** *** *** ");

        Student stdOne = new Student(
                "Mike",
                "Suarez",
                "10/05/1990",
                50,
                "Commanders"
        );
        stdOne.printStudentInfo();
    }
}
