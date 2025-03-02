package test_and_practice_for_interview.interview_question_record;

public class Runner {

    public static void main(String[] args) {

        EmployeeRecord employeeOne = new EmployeeRecord(
                "Sam",
                "David",
                "Engineer",
                "Houston",
                40
        );

        System.out.println(employeeOne);
        employeeOne.printEmployeeInfo();
    }
}
