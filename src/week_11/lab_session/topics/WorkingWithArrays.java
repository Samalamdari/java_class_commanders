package week_11.lab_session.topics;


import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {

        String[] names = new String[5];
        String[][] twoDimensionalArray = new String[2][2];
        int[][] twoDimension = new int[2][3];

        int[] numbers = { 1, 10, 25, 76,85, 42 };
        int[][] twoDimensionalArrayOfNumbers = {
                { 10, 50,  60 },
                { 90, 150, 250 }
        };

        String[][] twoNames = {
                { "james", "Eric" },
                { "Killy", "Mike" },
                { "Tony", "Lydia" }
        };

        names[0] = "John";
        names[1] = "Eric";
        names[2] = "Jack";
        names[3] = "David";
        names[4] = "Trevor";

        twoDimensionalArray[0][0] = "Killy";
        twoDimensionalArray[0][1] = "Lydia";
        twoDimensionalArray[1][0] = "Mike";
        twoDimensionalArray[1][1] = "Doe";


        System.out.println( names[0] );
        System.out.println( names[1] );
        System.out.println( names[2] );
        System.out.println( names[3] );
        System.out.println( names[4] );

        System.out.println( twoDimensionalArray[0][0] );
        System.out.println( twoDimensionalArray[0][1] );
        System.out.println( twoDimensionalArray[1][0] );
        System.out.println( twoDimensionalArray[1][1] );

        System.out.println( numbers );
        System.out.println( twoDimensionalArray );


        System.out.println(Arrays.toString(numbers) );
        System.out.println( Arrays.deepToString(twoDimensionalArray) );
        System.out.println( Arrays.deepToString(twoNames) );


    }

}
