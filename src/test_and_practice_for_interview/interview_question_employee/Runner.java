package test_and_practice_for_interview.interview_question_employee;

public class Runner {

    public static void main(String[] args) {

        var employeeOne = new Employee(
                "Sam",
                "David",
                "Engineer",
                "Houston",
                40
        );

        System.out.println(employeeOne);     // first way
        System.out.println("******");
        employeeOne.printEmployeeInfo();     // second way


    }
}
