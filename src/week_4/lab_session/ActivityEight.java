package week_4.lab_session;

import java.util.Arrays;
import java.util.Scanner;

public class ActivityEight {

    public static void main(String[] args) {

        /*
        *
        * User scanner to ask the user for the total number of employees in the org
        * // create an array of that size
        * // ask the name and the salary of each employee
        * // store the name and the salary of each employee
        * print the name of an employee and the salary of that employee
        * keep in mind that the salary will be on separate array
        *
        * */

        var input = new Scanner(System.in);
        int totalNumberOfEmployees;

        System.out.print("How many employees do you have: ");
        totalNumberOfEmployees = input.nextInt();

        String[] employees = new String[totalNumberOfEmployees];
        double[] salaries = new double[totalNumberOfEmployees];

        System.out.println("Please enter the name and the salaries of " + totalNumberOfEmployees + " employees: ");
        for ( int index = 0; index < employees.length; index++ ) {

            System.out.print("Name " + ( index + 1 ) + ": ");
            employees[index] = input.next();

            System.out.print("Salary " + ( index + 1 ) + ": ");
            salaries[index] = input.nextDouble();
        }

        System.out.println("Employees: " + Arrays.toString(employees) );
        System.out.println("Salaries: " + Arrays.toString(salaries) );

    }

}
