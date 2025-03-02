package week_9.day_1.activities;

public class Employee extends GeneralInformation{

    public Employee(String firstName, String lastName, String phoneNumber, String title) {
        super(firstName, lastName, phoneNumber, title);
    }

    @Override
    public void printInfo() {
        System.out.println("* * * * * EmployeeRecord * * * * * * ");
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Title: " + title);
        System.out.println("* * * * * * * * * * * * * * * * ");
    }
}
