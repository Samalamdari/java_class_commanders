package week_5.leb_session;

import java.util.Arrays;

public class DataTypes {

    /*
    * Primitive Data Types
    * Non-primitive --> Reference Data Types
    * */


    /*
    * Primitive Data Types
    *
    * numbers
    *
    *   byte
    *   short
    *   int
    *   int
    *
    *   Decimal Numbers
    *
    *   float
    *   double
    *
    *   character
    *
    *   char
    *
    *   conditions ->> true --> false
    *   boolean
    *
    *       byte
    *       short
    *       int
    *       long
    *       float
    *       double
    *       char
    *       boolean
    *
    * */


    public static void main(String[] args) {

        byte byteNumber = 127;

        System.out.println("Minimum value for byte: " + Byte.MIN_VALUE );
        System.out.println("Maximum value for byte: " + Byte.MAX_VALUE );

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        short shortNumber = 32_767;

        System.out.println("Minimum value for Short: " + Short.MIN_VALUE );
        System.out.println("Maximum value for Short: " + Short.MAX_VALUE );


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        int intNumber = 2147483647;

        System.out.println("Minimum value for int: " + Integer.MIN_VALUE ); // -2147483648
        System.out.println("Maximum value for int: " + Integer.MAX_VALUE ); // 2147483647


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        long longNumber = 2147483647L;

        System.out.println("Minimum value for int: " + Long.MIN_VALUE ); // 9223372036854775808
        System.out.println("Maximum value for int: " + Long.MAX_VALUE ); // 9223372036854775807


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        float floatNumber = 2147483647.57213F;

        System.out.println("Minimum value for float: " + Float.MIN_VALUE ); // 4.9E-324
        System.out.println("Maximum value for float: " + Float.MAX_VALUE ); // 1.7976931348623157E308


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        double doubleNumber = 2147.48364;

        System.out.println("Minimum value for double: " + Double.MIN_VALUE ); // 1.4E-45
        System.out.println("Maximum value for double: " + Double.MAX_VALUE ); // 3.4028235E38


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        char character = 'A';

        System.out.println( "Value of the character: " + character );


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        boolean isLightOn = true;

        System.out.println( "Value of the isLightOn: " + isLightOn );


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


        System.out.println( " * * * * * *  * * * * * *  Non-Primitive Data Types  * * * * * *  * * * * * *  " );


        int number = 10;
        int[] numbers = new int[2];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println(Arrays.toString( numbers ) );

        System.out.println( numbers[0] );
        System.out.println( numbers[1] );


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        char characterTwo = 'A';
        String firstName = "Bob";
        String characterOfTypeString = "A";


        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        /* charAt(index); */

        System.out.println( firstName.charAt(0) ) ;
        System.out.println( firstName.charAt(1) ) ;
        System.out.println( firstName.charAt(2) ) ;





    }



}
