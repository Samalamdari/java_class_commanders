package week_8.day_3_lab_session;

public class Runner {

    public static void main(String[] args) {

        // Loops
        /* Blocks which will be executed again and again as long as the condition is true.

        Types of loop:
        * 1. for loop
        * 2. while loop
        * 3. do while loop
        * 4. for each loop
        * */

        // 1. For Loop
        /*
        Syntax
        for ( Initialization; condition; Iteration ) {
                // Block of loop
        }
        So, in this scenario this block will be executing based on the condition and will be executed as long as the condition is true
        * */

        // Print numbers from 1 to 5
        for (int number = 1; number <= 5; number++) {
            System.out.println( number );
        }

        String[] names = { "Bob" };
        System.out.println("Total number of elements: " + names.length );

/*        for ( int index = 0; index <= names.length - 1 ; index++ ) {
            System.out.println( names[ index ] );
        }*/

        for ( int index = 0; index < names.length ; index++ ) {
//            System.out.println( names[ index ] );
            System.out.println( "[ " + index + " ] ==> " + "\"" + names[index] + "\"" );
        }


    }

}
