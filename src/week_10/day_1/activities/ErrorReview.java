package week_10.day_1.activities;

import java.util.Scanner;

public class ErrorReview {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;

        try {

            System.out.print("Enter the first number: ");
            numberOne = input.nextInt();


            System.out.print("Enter the second number: ");
            numberTwo = input.nextInt();

            System.out.println("Result: " + (numberOne / numberTwo));

        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }

        System.out.println("Java is getting interesting!");


    }

}
