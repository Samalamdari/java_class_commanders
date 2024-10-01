package week_8.day_3_lab_session;

public class ForEachLoop {

    public static void main(String[] args) {

        /*
        * Syntax
        *
        * for ( DataType data : Location to fetch the data ) {
        *
        *   // Loop Block
        *
        * }
        * */

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        System.out.print("Even numbers: ");
        // Print numbers from 1 to 10
        for ( int number : numbers ) {
            if ( number % 2 == 0 ) {
                System.out.print( number + ", " );
                sumOfEvenNumbers += number;
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for ( int number : numbers ) {
            if ( number % 2 != 0 ) {
                System.out.print( number + ", ");
                sumOfOddNumbers += number;
            }
        }

        /*
        * Even Numbers: 2, 4, 6, 8, 10
        * Odd Numbers: 1, 3, 5, 7, 9
        * */

        System.out.println();

        System.out.println("Sum of even numbers is: " + sumOfEvenNumbers );
        System.out.println("Sum of odd numbers is: " + sumOfOddNumbers );


    }

}
