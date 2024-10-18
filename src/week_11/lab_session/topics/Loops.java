package week_11.lab_session.topics;

public class Loops {

    public static void main(String[] args) {

        /*
        * for ( Initialization; condition; iteration ) {
        *   // Block of loop
        * }
        * */

        String message = "Hello World";
        String[] names = { "John", "Jack", "Eric", "Tony", "David" };
        int[] numbers = { 10, 20, 50, 60, 90, 1, 3, 5, 7 };
        int sumOfAllValues = 0;

        for ( int i = 1; i <= 10; i++ ) {
            System.out.println("Commanders!");
        }

        for ( int index = 0; index < message.length(); index++ ) {
            System.out.println( message.charAt(index) );
        }

        for ( int index = 0; index < names.length; index++ ) {
            System.out.println( names[index] );
        }

        for ( int index = 0; index < names.length; index++ ) {
            if ( names[index].equals("David") ) {
                System.out.println( index );
            }
        }

        // for each loop
        /*
        * for ( DataType name : location to grab the values ) {
        *   block of the loop
        * }
        * */

        for ( String name : names ) {
            System.out.println( name );
        }

        for ( int number : numbers ) {
            sumOfAllValues += number;
            System.out.println( number );
        }

        System.out.println("Sum of all values: " + sumOfAllValues );

        // Print even numbers
        for ( int number : numbers ) {
            if ( number % 2 == 0 ) System.out.print( number + " ");
        }

        System.out.println();

        // Print odd numbers
        for ( int number : numbers ) {
            if ( number % 2 != 0 ) System.out.print( number + " ");
        }

        System.out.println();

        for ( String name : names ) {
            if ( name.equals("Jack") ) {
                System.out.println(name);
                break;
            }
        }

        // Print numbers except 20 and 60
        for ( int number : numbers ) {
           if ( number == 20 || number == 60 ) continue;
           else System.out.print( number + " " );
        }

        // 3: while Loop
        /*
        Initialization
        * while ( condition ) {
        *   body of loop
        *  iteration;
        * }
        * */

        System.out.println();

        int index = 0;
        while ( index < message.length() ) {
            System.out.println( message.charAt(index) );
            index++;
        }

        index = 0;
        while ( index < names.length ) {
            System.out.println( names[index] );
            index++;
        }

        index = 0;
        while ( index < names.length ) {
            if ( names[index].equals("Eric") ) System.out.println(index);
            index++;
        }

        // 4: Do while Loop
        /*Initialization;
        * do {
        *       block of loop
        *       Iteration;
        * } while ( condition );
        * */

        index = 0;
        do {
            System.out.println("Welcome to tekSchool");
            index++;

        } while ( index <= 5 );


    }

}
