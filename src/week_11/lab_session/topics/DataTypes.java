package week_11.lab_session.topics;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        // primitive --> They can store a single value at a time!

        // Primitive data Types for non-decimal numbers
        byte byteNumber = 127;
        short shortNumber = 25_000;
        int intNumber = 1_000_000;
        long longNumber = 1_000_000_0000L;

        // Primitive data Types for decimal numbers
        float floatNumber = 15.2F;
        double doubleNumber = 15_000.1323367621;

        // primitive data type for true and false (conditions)
        boolean isLightOn = true;
        boolean isComputerOn = true;

        // Primitive data type to store single character
        char character = 'A';

        // Non-Primitive / Reference Data Types --> They can store multiple information at a time.
        String firstName = "John"; // Heap --> Address Assigned --> Address will be used instead of actual value! ==> 101
        String middleName = "John"; // 101
        String[] firstNames = { "Tony", "Alex", "David" };
        byte[] byteNumbers = { 127, 115 };

        // Primitive methods to get the minimum and maximum range for each data type
        byte minimumValue = Byte.MIN_VALUE;
        byte maximumValue = Byte.MAX_VALUE;

        System.out.println( "Byte minimum value: " + Byte.MIN_VALUE );
        System.out.println( "Byte minimum value: " + Byte.MAX_VALUE );


    }

}
