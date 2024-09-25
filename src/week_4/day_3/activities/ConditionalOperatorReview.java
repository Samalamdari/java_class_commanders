package week_4.day_3.activities;

public class ConditionalOperatorReview {

    public static void main(String[] args) {

        /*
        * ( Condition ) ? return true : return false;
        * */

        int numberOne = 1;
        int numberTwo = 10;
        int smallNumber;

        // Find the smaller number among these two
        smallNumber = ( numberOne < numberTwo ) ? numberOne : numberTwo;

        System.out.println( ( numberOne < numberTwo ) ? numberOne : numberTwo );
        System.out.println( "The smaller number is: " + smallNumber );

    }

}
