package week_3.lab_session;

import java.util.Scanner; // Import the Scanner class for reading user input

public class ScannerExample {

    public static void main(String[] args) {

        // This program takes the employee's details as input and prints them out.
        // The details include ID, first name, last name, date of birth, and salary.

        // Create a Scanner object named 'input' to read input from the console
        // Syntax for creating an object

        // NameOfTheClass nameOfTheObject = new NameOfTheClass();
        var input = new Scanner(System.in);
       // Scanner input = new Scanner(System.in);

        // Declare variables to store employee information
        int id;                 // Variable to store the employee's ID
        String firstName;       // Variable to store the employee's first name
        String lastName;        // Variable to store the employee's last name
        String dateOfBirth;     // Variable to store the employee's date of birth
        double salary;          // Variable to store the employee's salary

        // Prompt the user to enter their ID and read the input value
        System.out.print("Please enter your ID: ");
        id = input.nextInt();   // Read the integer input for ID

        // Prompt the user to enter their first name and read the input value
        System.out.print("Please enter your first name: ");
        firstName = input.next(); // Read the string input for first name

        // Prompt the user to enter their last name and read the input value
        System.out.print("Please enter your last name: ");
        lastName = input.next();  // Read the string input for last name

        // Prompt the user to enter their date of birth and read the input value
        System.out.print("Please enter your date of birth: ");
        dateOfBirth = input.next(); // Read the string input for date of birth

        // Prompt the user to enter their salary and read the input value
        System.out.print("Please enter your salary: ");
        salary = input.nextDouble(); // Read the double input for salary

        // Print a decorative line to start the output section
        System.out.println(" * * * * * * * * * * YOUR INFORMATION * * * * * * * * * * * * * * * ");

        // Output the information entered by the user
        System.out.println("Your ID: " + id);                // Display the entered ID
        System.out.println("Your first name: " + firstName);  // Display the entered first name
        System.out.println("Your last name: " + lastName);    // Display the entered last name
        System.out.println("Your date of birth: " + dateOfBirth); // Display the entered date of birth
        System.out.println("Your salary: " + salary);          // Display the entered salary

        // Print a decorative line to end the output section
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

    }

}
