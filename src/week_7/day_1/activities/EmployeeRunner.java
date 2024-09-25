package week_7.day_1.activities;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        Employee secondEmployee = new Employee();
//        var firstEmployee = new Employee();

        firstEmployee.firstName = "Bob";
        firstEmployee.lastName = "Morphy";
        firstEmployee.salary = 25_000.0;
        firstEmployee.dateOfBirth = "mm/dd/yyyy";

        firstEmployee.printInfo();

        System.out.println( " * * * * * * * * * * * * * * * " );

        secondEmployee.firstName = "Tony";
        secondEmployee.lastName = "tony lastName";
        secondEmployee.salary = 45_000.0;
        secondEmployee.dateOfBirth = "mm/dd/yyyy";

        secondEmployee.printInfo();

    }

}
