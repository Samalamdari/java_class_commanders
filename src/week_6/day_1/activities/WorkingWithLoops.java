package week_6.day_1.activities;

public class WorkingWithLoops {

    public static void main(String[] args) {

        int[] numbers = { 150, 20, 30, 40, 50 };
        // What is the sum of first and the second number
        int sum = 0;
        int resultOfTwoElements = 0;

        for ( int number : numbers ) {
            sum += number;
        }

        System.out.println("Sum of two numbers: " + sum );

        for ( int index = 0; index <= 1; index++ ) {
            resultOfTwoElements += numbers[index];
        }

        System.out.println("Sum of two numbers: " + resultOfTwoElements );

        resultOfTwoElements = 0;

        for ( int index = 0; index <= numbers.length - 1; index++ ) {
            if ( index <= 1 ) {
                resultOfTwoElements += numbers[index];
            } else {
                break;
            }
        }

        System.out.println("Sum of two numbers: " + resultOfTwoElements );

        for ( int index = 0; index <= numbers.length - 1; index++ ) {
            System.out.print( numbers[index] + " " );
        }

    }

}
