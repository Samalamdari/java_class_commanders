package week_5.day_2.activities;

import java.util.Arrays;

public class Review {

    public static void main(String[] args) {

        int[][] numbers = new int[3][2];
        char[][] characters = new char[3][2];
        boolean[][] booleans = new boolean[3][2];
        double[][] salaries = new double[3][2];
        String[][] names = new String[3][2];

        numbers[0][0] = 10;
        salaries[0][0] = 20.985;

        System.out.println( numbers[0][0] );

        System.out.println(Arrays.deepToString(numbers) );
        System.out.println(Arrays.deepToString(names) );


    }

}
