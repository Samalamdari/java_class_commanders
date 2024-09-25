package week_5.day_1.activities;

import java.util.Arrays;

public class DynamicInitializationOfArray {

    public static void main(String[] args) {

        String[] names = new String[2];

        names[0] = "Bob";
        names[1] = "Jack";

        System.out.println( names[0] );
        System.out.println( names[1] );
        System.out.println("The size of the array is: " + names.length );

        System.out.println( names[0].charAt(0) );
        System.out.println( names[1].charAt(1) + "" + names[1].charAt(2) );
        System.out.println( names[1].substring(1, 3) );

        int[] scores = { 55, 97, 105, 1, 0, 2, 90, 100, 1,1 , 0, 1, 2, 3, 1 };

        System.out.println("The size of the array is: " + scores.length );

        // scores[7] = 190;

        System.out.println( "Values of score array: " +  Arrays.toString(scores) + "\n the size of the array is: " + scores.length ) ;

        Arrays.sort(scores);

        System.out.println( "Values of score array: " +  Arrays.toString(scores) + "\n the size of the array is: " + scores.length ) ;



    }

}
