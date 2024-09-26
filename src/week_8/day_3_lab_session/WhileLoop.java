package week_8.day_3_lab_session;

public class WhileLoop {

    public static void main(String[] args) {

        // While
        // Syntax
        /*
        *
        *  Initialization
        *  while ( condition ) {
        *   // Block of loop
        *   // Iteration ++, -- || infinite if not mentioned!
        * }
        *
        * */

        // print numbers from 1 to 5
        int number = 1;
        while ( number <= 5 ) {
            System.out.println( number );
            number++;
        }

        String[] names = { "Bob" };
//        System.out.println( names[4] ); // n - 1 == 5 - 1
        System.out.println( names[ names.length - 1 ] ); // n - 1 == 5 - 1

//        int index = 0;
//        while ( index < names.length ) {
//            System.out.println( "[ " + index + " ] ==> " + "\"" + names[index] + "\"" );
//            index++;
//        }

        /*

        Bob, James, Trevor, Tony, Eric

        *  */

        int index = 0;
        while ( index < names.length ) {
            if ( index == names.length - 1 ) {
                System.out.print( names[index] );
            } else {
                System.out.print( names[index] + ", " );
            }
            index++;
        }




    }

}
