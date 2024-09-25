package week_5.day_1.activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionArray {

    public static void main(String[] args) {

        int[][] twoDimensionArray = new int[2][2];
        String[][] firstNames = new String[3][2];

        // store the information in the first array
        twoDimensionArray[0][0] = 50;
        twoDimensionArray[0][1] = 40;
        twoDimensionArray[1][0] = 50;
        twoDimensionArray[1][1] = 60;

        // Store names in the second 2D array
        firstNames[0][0] = "A";
        firstNames[0][1] = "B";
        firstNames[1][0] = "C";
        firstNames[1][1] = "D";
        firstNames[2][0] = "E";
        firstNames[2][1] = "F";

        System.out.println( twoDimensionArray[1][1] );
        System.out.println( twoDimensionArray[1][0] );

        // Print the elements of the second array

        System.out.println( firstNames[0][0] );
        System.out.println( firstNames[0][1] );
        System.out.println( firstNames[1][0] );
        System.out.println( firstNames[1][1] );
        System.out.println( firstNames[2][0] );
        System.out.println( firstNames[2][1] );

        System.out.println("2D Array length: " + twoDimensionArray.length );
        System.out.println("2D Array length: " + firstNames.length );

        System.out.println(Arrays.toString( twoDimensionArray ) );
        System.out.println(Arrays.toString( firstNames ));
        System.out.println(Arrays.toString( firstNames[0] ));
        System.out.println(Arrays.deepToString(firstNames) );





    }

}
