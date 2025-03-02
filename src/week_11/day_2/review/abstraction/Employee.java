package week_11.day_2.review.abstraction;

public class Employee extends GeneralInformation {

    static int countEmployee = 0;
    int employeeId = 0;

    public Employee(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
        countEmployee++;
    }

    @Override
    public void print() {
//        System.out.println(" * * * * * * " + getFirstName() +  " " + getLastName() + " * * * * * * ");
        System.out.println(" * * * * * * EmployeeRecord " + countEmployee + " * * * * * * ");
        System.out.println("FirstName: " + getFirstName() );
        System.out.println("LastName: " + getLastName() );
        System.out.println("Age: " + getAge() );
        System.out.println("Address: " + getAddress() );
    }

    public void printCountOfEmployee() {
        System.out.println("We have " + countEmployee + " employees.");
    }

}
