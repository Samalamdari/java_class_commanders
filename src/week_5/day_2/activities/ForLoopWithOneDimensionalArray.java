package week_5.day_2.activities;

public class ForLoopWithOneDimensionalArray {

    public static void main(String[] args) {

        int[] numbers = { 10, 50, 60, 1, 0, 2, 5 };

//        for ( int index = 0; index <= numbers.length - 1; index++ ) {
//            System.out.println( numbers[index] );
//        }

        /*
        * [ 0 ] = X
        * [ 1 ] = Y
        * */

//        for ( int index = 0; index <= numbers.length - 1; index++ ) {
//            System.out.println( "[ " + index + " ] = " + numbers[index] );
//        }

//        for ( int index = 0; index <= numbers.length - 1; index++ ) {
//            System.out.print( numbers[index] + " ");
//        }

        for ( int index = 0; index <= numbers.length - 1; index++ ) {
            if ( index == numbers.length - 1 ) {
                System.out.print( numbers[index] + "");
            } else {
                System.out.print( numbers[index] + ", ");
            }
        }

    }

}
