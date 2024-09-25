package week_5.day_1.activities;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithOneDimensionArray {

    /*
    * Use scanner and try to get the values from the user
    * for instance, firstName, lastName, dateOfBirth
    *
    * store these information within the array
    * and print the values in the console
    * */

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        String[] employeeInformation = new String[3];


        System.out.print("Please enter your firstName: ");
        employeeInformation[0] =  input.next();

        System.out.print("Please enter your lastName: ");
        employeeInformation[1] =  input.next();

        System.out.print("Please enter your dateOfBirth: ");
        employeeInformation[2] =  input.next();

        System.out.println("FirstName: " + employeeInformation[0]);
        System.out.println("LastName: " + employeeInformation[1]);
        System.out.println("DateOfBirth: " + employeeInformation[2]);

        System.out.println(Arrays.toString(employeeInformation));



    }

}

