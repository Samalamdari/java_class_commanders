package week_5.day_2.activities;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopWithScannerAndOneDimensionalArray {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("You have 15 slots available to store numbers, so please enter numbers so that I can store in array!");
        for ( int i = 0; i < numbers.length; i++ ) {
//            /* Enter number 1: X */
            System.out.print("Enter number " + ( i + 1 ) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("These are the values: " + Arrays.toString(numbers));


    }

}
