package week_3.day_3.activites;

public class Review {

    public static void main(String[] args) {

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

        byte byteNumber = 10;
        int intNumber = byteNumber;

        System.out.println( Long.MAX_VALUE );

        long longNumber = 9223372036854775807L;
        int intNumberTwo = (int) longNumber;

        System.out.println( intNumberTwo );

        double doubleNumber = 60.50123;

        System.out.println( doubleNumber );

        intNumberTwo = (int) doubleNumber; // 60.50123

        System.out.println( intNumberTwo ); // 60.50123

        System.out.println( "Welcome commanders: " + 2024 );
        System.out.println( "The result of 5 + 10 =  " + (5 + 10) );
        System.out.println(  5 + 10 + " The result of 5 + 10 " );


        System.out.println( "Hello HWorld".replaceFirst("H", "h") );
        System.out.println( "Hello HWorld".replaceAll("H", "h") );
        System.out.println( "Hello World".replace("Hello", "Java!") );
        System.out.println( "Hello World".replace('l', 'L') );


        System.out.println( "Hello World".toUpperCase() );
        System.out.println( "Hello World".toLowerCase() );
        System.out.println( "                          Hello World                        ".trim() );
        System.out.println( "Hello World".contains("Hello") );


        System.out.println( 10 == 10 );
        System.out.println( "Hello" == "Hello" );
        System.out.println( "Hello".equals("Hello") );


        String message = "Hello Commanders";

        System.out.println( message.charAt(0) ); // 0
        System.out.println( message.charAt(1) ); // 1
        System.out.println( message.charAt(2) ); // 2
        System.out.println( message.charAt(3) ); // 3


        System.out.println( message.hashCode() );

//        System.out.println( 10 == "Hello" );


    }

}
