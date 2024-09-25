package week_6.day_1.activities;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

       int[][] numbers = {
               { 10, 20, 30 },
               { 40, 50, 60, 70, 80, 90 },
               { 10, 10 }
       };

       Scanner input = new Scanner(System.in);
       int row, col;
//
//       for ( int row = 0; row < numbers.length; row++ ) {
//           for ( int col = 0; col < numbers[row].length; col++ ) {
//               System.out.print( numbers[row][col] + " " );
//           }
//           System.out.println();
//       }

//       for ( int i = 1; i <= 10; i++ ) {
//           for ( int j = i + 1; j <= 10; j++ ) {
//               System.out.print(" * ");
//           }
//           System.out.println();
//       }

       /*
       *
       * *
       * * *
       * * * *
       * * * * *
       * * * * * *
       * */

        System.out.print("How many rows do you want to be printed: ");
        row = input.nextInt();

//        System.out.print("How many cols do you want to be printed: ");
//        col = input.nextInt();

        for ( int i = 1; i <= row; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(" * ");
            }
            System.out.println();
        }



    }

}
