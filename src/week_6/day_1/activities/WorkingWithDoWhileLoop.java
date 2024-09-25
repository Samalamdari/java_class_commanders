package week_6.day_1.activities;

public class WorkingWithDoWhileLoop {


    public static void main(String[] args) {

        int[] numbers = { 10, 50, 30 };

        for ( int index = 0; index < -55 ; index++ ) {
            System.out.print( numbers[index] + " " );
        }

       int index = 0;
        while ( index < -55 ) {
            System.out.print( numbers[index] + " " );
            index++;
        }


        do {
            // System.out.println("Java is easy!");
            if ( numbers.length == 0 ) {
                System.out.println("Array is empty, please add some values!");
            } else {
                System.out.print(numbers[index] + " ");
                index++;
            }
        } while ( index < numbers.length  );

    }


}
