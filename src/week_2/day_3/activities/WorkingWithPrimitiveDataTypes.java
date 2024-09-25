package week_2.day_3.activities;

public class WorkingWithPrimitiveDataTypes {

    public static void main(String[] args) {

        // primitive Data Types
        // 1: Byte --> Tiny Jar --> numbers

        byte byteNumber = -128;

        System.out.println( Byte.MIN_VALUE ); // byte minimum value: -128
        System.out.println( Byte.MAX_VALUE ); // byte maximum value: 127

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        short shortNumber = 32767;

        System.out.println( Short.MIN_VALUE ); //  short minimum value:  -32768
        System.out.println( Short.MAX_VALUE ); // short maximum value:  32767

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        int intNumber = 214_748_3647;

        System.out.println( Integer.MIN_VALUE ); // int minimum value: -214_748_3648
        System.out.println( Integer.MAX_VALUE ); // int maximum value:: 214_748_3647

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        long longNumber =  214_748_3647L;

        System.out.println( Long.MIN_VALUE ); // long minimum value: -9223372036854775808
        System.out.println( Long.MAX_VALUE ); // long maximum value: 9223372036854775807

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        float floatNumber = 5.5F;

        System.out.println( Float.MIN_VALUE ); // float minimum value: 1.4E-45
        System.out.println( Float.MAX_VALUE ); // float maximum value: 3.4028235E38

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        double doubleNumber = 5.5;

        System.out.println( Double.MIN_VALUE ); // double minimum value: 4.9E-324
        System.out.println( Double.MAX_VALUE ); // double maximum value: 1.7976931348623157E308

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        char character = 'A'; // Tiny box that can store only one character NOT more than one character

        // NOTE: The value of the char should be in between single quotation ==> ' '
        // If you store the value in between double quotation it will be considered as String ==> " "

        System.out.println( character ); // Will print A

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );

        // Boolean data type can store either true or false.
        // Keep in mind that Java is case-sensitive, so TRUE, True and FALSE and False will not be accepted.
        boolean isLightOn = true;
        isLightOn = false;

        System.out.println( " * * * * * * * * * * * * * * * * * * * * " );




    }

}
