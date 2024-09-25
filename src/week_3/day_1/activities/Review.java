package week_3.day_1.activities;

public class Review {

    public static void main(String[] args) {

        // Primitive Data Types
        /*
        * byte --> numbers
        * short --> numbers
        * int --> numbers
        * long --> numbers
        * float --> decimal numbers --> f, F
        * double --> decimal numbers
        * char --> character
        * boolean --> true, false --> True, False + TRUE, FALSE
        * */

        byte byteNumberOne;
        byte byteNumberTwo;
        byte byteNumberThree;

        short shortNumber  = 32_000;

        // Methods
        System.out.println( Short.MIN_VALUE );
        System.out.println( Short.MAX_VALUE );

        int intNumber = 15;

        int intNumberOne = 10, intNumberTwo = 20, intNumberThree = 50;

        System.out.println( Integer.MAX_VALUE );

        long longNumber = 2147483648L;

        float floatNumber = 15.5F;
        double doubleNumber = 15.5;

        char character = 'A';
        boolean isLightOn = true;

        // Non-Primitive Data Types
        // Array --> String[], int[], boolean[]
        // interface --> classes
        // classes, objects


        //                     1    2    3
        char[] characters = { 'A', 'B', 'C' };
        //                     0    1    2
        System.out.println( characters[1] );

        // n - 1 ==> 3 - 1 ==> 2
        // n - 2 ==>  3 - 2 ==> 1


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        // Operators
        System.out.println( 10 + 20 );
        int numberOne = 80;
        int numberTwo = 50;
        System.out.println( numberOne + numberTwo  );
        //                      80    +    50    ==> 130
        int result = numberOne + numberTwo;
        //              80     +    50    ==> 130;
        System.out.println( result );

        System.out.println( 10 + 'A' ); // 10A
        System.out.print(  10 +  "Commanders " );
        System.out.println( "Welcome" );
        System.out.println( " * " );

        System.out.println( 50 + "Commanders" + 20 + 50 ); // 50Commanders2050

        System.out.println( 50 + "Commanders" + (20 + 50) ); // 50Commanders70

        /*
        * 20 + 10 - 4 / 5 * 6 + 5
        * 20 + 10 - 0.8 * 6 + 5
        * 20 + 10 - 4.8 + 5
        * 30 - 4.8 + 5
        * 25.2 + 5
        * 30.2
        *
        * */

        System.out.println( 5 / 20 + 10 - 4 / 15 * 6 + 5 + 2.2 ); // int 17.2
        int expression = (int ) (5 / 20 + 10 - 4 / 15 * 6 + 5 + 2.2);
        System.out.println( expression );


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        System.out.println( 10 * 5 );
        System.out.println( 10 * 5 * 100 );
        System.out.println( 10 * 5 * 0 );
        System.out.println( 10 * 5 * 150 * 190);


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        System.out.println( 10 - 5 );
        System.out.println( 10 - 5 - 100 );
        System.out.println( 10 - 5 - 0 );
        System.out.println( 10 - 5 - 150 - 190);
        System.out.println( 10 + "Hello Java!" + (50 * 20) + 10 + 10 );

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        System.out.println( 10 / 2 ); // ==> 5
        System.out.println( 10 % 2 ); // ==> 0


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


    }

}
