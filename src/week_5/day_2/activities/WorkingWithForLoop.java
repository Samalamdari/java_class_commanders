package week_5.day_2.activities;

import java.util.Scanner;

public class WorkingWithForLoop {

    public static void main(String[] args) {

        // Print "Commanders" 10 times.
        // for ( int number = 1; number <= 10; number++ ) System.out.println( number  + ": Commanders");

        // Ask the user for their name and then ask them how many times they would like to print it into the console
        Scanner input = new Scanner(System.in);
        String firstName = "";
        int times = 0;

        System.out.print("Please enter your name: ");
        firstName = input.next();

        System.out.print("How many times would you like to print your name: ");
        times = input.nextInt();

        for ( int i = 1; i <= times; i++ ) System.out.println(  i + ": " + firstName);



    }

}
