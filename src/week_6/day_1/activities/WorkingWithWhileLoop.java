package week_6.day_1.activities;

import java.util.Random;

public class WorkingWithWhileLoop {

    /*
    * Initialization
    * while ( condition ) {
    *       // The body of the loop
    *       Iteration; Increment or Decrement
    * }
    * */

    public static void main(String[] args) {

        // prepare things in which we need for the execution of this code
        int[] randomNumbers = new int[10];
        Random random = new Random();
        int randomNumber;
        int sumOfTwoArrayElements = 0;



        // Fill in the array with 10 random numbers
        for ( int i = 0; i < randomNumbers.length; i++ ) {
            // ( Max  - Min ) + Min
            randomNumber = random.nextInt(( 10 - 1 )  + 1);
            randomNumbers[i] = randomNumber;
            System.out.print( randomNumbers[i] + " " );
        }

        System.out.println();
        // Print the elements using While loop
        int index = 0;
//        System.out.print("While Loop print: ");
        while ( index < randomNumbers.length ) {
            System.out.print(randomNumbers[index]   + " " );
            index++;
        }

        // Print the sum of the first two elements
        index = 0;
        while ( index <= 1 ) {
            sumOfTwoArrayElements += randomNumbers[index];
            index++;
        }

        System.out.println();
        System.out.println( "Sum of first two numbers: " + sumOfTwoArrayElements );





    }

}
