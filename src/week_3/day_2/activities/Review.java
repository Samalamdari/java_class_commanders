package week_3.day_2.activities;

public class Review {

    public static void main(String[] args) {


        // length()
        System.out.println( "Hello".length() );

        String firstName = " Bob ";
        System.out.println( firstName.length() );

        int countOfFirstName = firstName.length();

        System.out.println( countOfFirstName );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        //
        String message = "Welcome commanders!";
        //  index              012345678910

        System.out.println( message.substring(4) );
        System.out.println( message.substring(4, 9) ); // endIndex --> exclusive , -1 ==> 7 - 1 ==> 6
        System.out.println( message.length() );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );
        

    }

}
