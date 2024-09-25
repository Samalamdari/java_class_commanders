package week_2.day_3.topics;

public class Operators {

    public static void main(String[] args) {

        /*  Operators:
        *   Operators are like the basic calculations you can do on a calculator: addition, subtraction, etc.
        In Java, you have various operators like +, -, *, and / to perform operations.
        *
        * */

        // How to add or sum two numbers together and print the result of the operation?

        // Addition ' + '
        int numberOne = 10;
        int numberTwo = 10;
        int result = numberOne + numberTwo;
        //   result      =     5      +   10          ==> 15

        System.out.println( numberOne + numberTwo );
        //                      5    +      10      ==> 15

        // Or you can directly perform the operation and print the result
        System.out.println( 5 + 10 );

        // Or print the result of the operation which is stored in a variable called "result"
        System.out.println( result );

        // If you use + operator with characters, their dec value from ASCII chart will be captured
        // Dec ==> A --> 65
        // Dec ==> B --> 66
        // 'A' + 'B' ==> 65 + 66 ===> 131
        System.out.println( 'A' + 'B' );

        // If we use + operator with String it is going to act different.
        System.out.println( "A" + "B" ); // AB
        System.out.println( "A" + 10 ); // A10
        System.out.println( "A" + 10 + 20 );  // A1020
        // A10 + 20  ==> A1020
        // S   + N

        System.out.println( 10 + 20 + "A" ); // 30A
        //                  N  + N  + S
        //                  30 + S
        //                    30A

        System.out.println( 10 + 20 + "A" + 10 + 50 );
        //                  N  + N  +  S  + N  + N
        //                     N    +  S  +   N
        //                      S  + N
        //                          S
        // 30A1050

        System.out.println( "10PM" );
        System.out.println( 10 + "PM" );
        System.out.println( 5 + 5 + "PM" );
        System.out.println( 2 * 5 + "PM" );
        System.out.println( "Time: " + 2 * 5 + "PM" );
        System.out.println( "Time: " + 5 + 5 + "PM" );
        System.out.println( "Time: " + (5 + 5)+ "PM" );


        // "Time: 55PM"


        System.out.println( "The result of " + numberOne + " + " + numberTwo + " = " + result  );

    }

}
