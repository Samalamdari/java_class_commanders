package test_and_practice_for_interview.divideTheNumberByZero;

import java.util.Scanner;

public class DivideTheNumberByZero {

    public static void main(String[] args) {


        // way 1:

//        int numberOne = 5;
//        int numberTwo = 0;
//        int result = (numberOne/numberTwo);

//        System.out.println("divide result: " + result);


        // way 2:
        // use exception

            Scanner input = new Scanner(System.in);

            int numberOne = 0;
            int numberTwo = 0;

        try {

            System.out.print("Enter First Number: ");
            numberOne = input.nextInt();

            System.out.print("Enter Second Number: ");
            numberTwo = input.nextInt();

            System.out.println("Result: " + (numberOne / numberTwo));

        } catch (ArithmeticException e){
            System.out.println("Can not divide by zero.");
            e.printStackTrace();  // ===> we can use this code for details of error
        }
        System.out.println("Java is easy!");

    }
}
