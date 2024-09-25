package week_3.day_2.activities;

public class CastingExample {

    public static void main(String[] args) {

        // Casting --> Conversion from smaller data type into the bigger data type.

        /*
        * byte
        * short
        * int
        * long
        * float
        * double
        * char
        * boolean
        * */

        int intNumber = 10;

        System.out.println( intNumber );

        double doubleNumber = intNumber;

        System.out.println( doubleNumber );

        double doubleNumberTwo = 10;

        System.out.println( doubleNumberTwo );


        intNumber =  (int) doubleNumber;


        System.out.println( intNumber );

        int value =  (int) 55.5991;

        System.out.println( value );

        System.out.println( " * * * * *   * * * * *  * * * * *  * * * * *  * * * * *  * * * * * " );

        double numberOne = 55;
        double numberTwo = 100.76;
        int result = (int) (numberOne + numberTwo);

        System.out.println( "Result: " +  result );


        System.out.println( " * * * * *   * * * * *  * * * * *  * * * * *  * * * * *  * * * * * " );


    }

}
