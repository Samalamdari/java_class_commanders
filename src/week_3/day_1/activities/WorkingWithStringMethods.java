package week_3.day_1.activities;

public class WorkingWithStringMethods {

    public static void main(String[] args) {


        // String Methods
        /*
        * 1: length()
        * */

        String firstName = "Tony";
        System.out.println("Actual value: " + firstName);
        System.out.println( "Count of the character including spaces: " + firstName.length() );

        // Let's add some empty spaces and get the count again
        firstName = " Tony ";
        System.out.println( "Count of the character including spaces: " + firstName.length() );

         System.out.println( "Hello World".length() ); // ---> Is this possible??

        String welcomeMessage = "Hello World";

        System.out.println( welcomeMessage.length() );


        System.out.println( " * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * * " );


        System.out.println( welcomeMessage.substring(6) );
        System.out.println( welcomeMessage.substring(3) );

        System.out.println( welcomeMessage.substring(0, 5) ); // Hello will be returned
        System.out.println( welcomeMessage.substring( 6, 11 ) ); // World is going to be returned
        System.out.println( welcomeMessage.substring(6) );


        System.out.println( " * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * * " );

    }

}
