package week_8.day_1.activities;

// OOP

public class Runner {

    public static void main(String[] args) {

//        Student stdOne = new Student();
        Employee empOne = new Employee(
                "John",
                "Doe",
                "12/15/1989",
                45,
                "TekSchool"
        );

        empOne.printEmployeeInfo();

                Student stdOne = new Student(
                        "Mike",
                        "M lastName",
                        "10/12/1970",
                        87,
                        "Commanders"
                );

            stdOne.printStudentInfo();




    }

}
