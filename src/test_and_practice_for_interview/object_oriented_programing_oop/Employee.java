package test_and_practice_for_interview.object_oriented_programing_oop;

public class Employee {

    String firstName;
    String lastName;
    double salary;
    int age;
    String phoneNumber;

    public void printEmpInfo(){
        System.out.println("EmployeeRecord Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Salary: $" + salary);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
