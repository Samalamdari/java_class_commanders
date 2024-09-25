package week_5.day_2.activities;

public class WorkingWithForEachLoop {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40 };
        int total = 0;

//        for ( int index = 0; index < numbers.length; index++ ) {
//            System.out.println( numbers[index] );
//            // total = total + numbers[index];
//            total += numbers[index];
//        }

        // System.out.println("Total is: " + total );

        System.out.println( " * * * * * *   * * * * * *   * * * * * *   * * * * * *   * * * * * *  " );

        // Or you can use forEach loop to print the elements of array
        for ( int number : numbers ) {
            System.out.println( number );
            total += number;
        }

        System.out.println("Total is: " + total );

        // Calculate the total of numbers from array


    }

}
