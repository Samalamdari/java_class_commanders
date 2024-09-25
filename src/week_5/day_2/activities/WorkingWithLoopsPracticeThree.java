package week_5.day_2.activities;

public class WorkingWithLoopsPracticeThree {

    public static void main(String[] args) {

        // Array of int
        int[] numbers = { 10, 50, 70, 40, 3, 0, 1, 2 };

        // loop to go through the array elements
        for ( int index = 0; index < numbers.length; index++ ) {
            if ( index == numbers.length - 1 ) {
                System.out.print( numbers[index] + "");
            } else {
                System.out.print( numbers[index] + ", " );
            }
        }

        System.out.println();
        System.out.println(" * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  * * * * * * *  ");

        for ( int index = 0; index < numbers.length; index++ ) System.out.print( ( index == numbers.length - 1 ) ? numbers[index] + "" : numbers[index] + ", " );


    }

}
