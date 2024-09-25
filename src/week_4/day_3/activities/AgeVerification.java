package week_4.day_3.activities;

import java.util.Scanner;

public class AgeVerification {

       /*
    * Age Group Classification

    Objective: Classify individuals into age groups based on their age.

    You're designing a system that categorizes individuals into age groups:
    *  Child (0-12),
    * Teenager (13-19),
    * and Adult (20 and above).
    A user provides their age: int userAge = 15; (This value can be changed for testing).
    Determine the user's age group.
    Print out the age group of the user.
    * */

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int userAge = 0;
        String ageGroup = "";

        System.out.print("Please enter your age: ");
        userAge = input.nextInt();

        if ( userAge > 100 ) System.out.println("Invalid entry!");

        if ( (userAge >= 0) && ( userAge <= 12 ) ) {
            System.out.println("Your age group: child");
            ageGroup = "child";
        } else if ( (userAge >= 13) && ( userAge <= 19 ) ) {
            System.out.println("Your age group: Teenager");
            ageGroup = "Teenager";
        }  else {
            System.out.println("Your age group: Adult");
            ageGroup = "Adult";
        }


        System.out.println("Your age group: " + ageGroup );

    }


}
