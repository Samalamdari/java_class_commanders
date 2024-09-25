package week_5.leb_session;

public class ConditionalStatements {

    public static void main(String[] args) {

        /*
        * if ( condition ) {
        *   // truth block
        * }
        * */

        System.out.println( "Before!" );

        if ( 10 == 20 ) {
            System.out.println( "Yes" );
        } else if ( 20 == 50 ) {
            System.out.println( "Yes" );
        } else if ( 100 == 100 ) {
            System.out.println("Yes");
        } else {
            System.out.println( "Non of the above conditions are true" );
        }

        System.out.println( "After!" );



    }

}
