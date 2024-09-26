package week_8.day_3_lab_session;

public class DoWhileLoop {

    public static void main(String[] args) {

        /*
         Initialization;
        * do {
        *  // Block of loop
        Iteration
        * } while ( condition );
        * */

        // Print numbers from 1 to 5
        int number = 1;
        do {
            System.out.print( number );
            number++;
        } while ( number <=5 );

        System.out.println();

        String[] names = { "Bob" };
        System.out.println( names.length );

        int index = 0;
        do {
            if ( names.length == 0 ) {
                System.out.println("Array is empty, please add some values first.");
            } else {
                System.out.println(names[index]);
                index++;
            }
        } while ( index < names.length );


    }

}
