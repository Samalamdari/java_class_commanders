package week_4.day_2.activities;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        /*
         *  ( condition ) ? return if true  :  return if false;
         * */

        // Find the maximum number among two numbers using scanner

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, max;

        // Prompt user to enter the first number
        System.out.print("Please enter the first number: ");
        numberOne = input.nextInt();

        // Prompt user to enter the second number
        System.out.print("Please enter the second number: ");
        numberTwo = input.nextInt();

        // Find the maximum number using the conditional operator
        max = (numberOne < numberTwo) ? numberTwo : numberOne;

        // Print a decorative line
        System.out.println(" * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *");

        // Print the result using the conditional operator
        System.out.println("The greater number is: " + ((numberOne < numberTwo) ? numberTwo : numberOne));

        // Print the result stored in the 'max' variable
        System.out.println("The greater number is: " + max);

        // Print a detailed result message
        System.out.println("The greater number among " + numberOne + " and " + numberTwo + " is = " + max);

        // Print a detailed result message using the conditional operator
        System.out.println("The greater number among " + numberOne + " and " + numberTwo + " is = " +
                ((numberOne < numberTwo) ? numberTwo : numberOne));
    }

}
