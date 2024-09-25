package week_4.day_1.activities;

import java.util.Scanner;

public class ActivityTwo {

    // Ask the user for two numbers, and then print the bigger number in the console
    // for example, if you gave me 20 and 50, 50 should be printed into the console.


    public static void main(String[] args) {

        // Arrange
        var input = new Scanner(System.in);
        int numberOne, numberTwo;

        // Act, Action
        System.out.print("Enter the first number: ");
        numberOne = input.nextInt();

        System.out.print("Enter the second number: ");
        numberTwo = input.nextInt();


        if ( numberOne > numberTwo ) {
            System.out.println( numberOne + " is bigger than " + numberTwo );
        } else {
            System.out.println( numberTwo + " is bigger than " + numberOne );
        }

    }

}
