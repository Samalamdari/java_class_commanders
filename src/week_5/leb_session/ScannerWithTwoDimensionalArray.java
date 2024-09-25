package week_5.leb_session;

import java.util.Scanner;

public class ScannerWithTwoDimensionalArray {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int rows, cols;

        System.out.print("How many rows do you want: ");
        rows = input.nextInt();

        System.out.print("How many cols do you want: ");
        cols = input.nextInt();

        String[][] items = new String[rows][cols];

        for ( int row = 0; row <= items.length - 1; row++ ) {
            for ( int col = 0; col <= items.length - 1; col++  ) {
                System.out.print("Item [ " + row + " ] [ " + col + " ] : ");
                items[row][col] = input.next();
            }
            System.out.println();
        }

        for ( int row = 0; row <= items.length - 1; row++ ) {
            for ( int col = 0; col <= items.length - 1; col++  ) {
                System.out.print( items[row][col] + " " );
            }
            System.out.println();
        }

        for ( int row = 0; row <= items.length - 1; row++ ) {
            for ( int col = 0; col <= items.length - 1; col++  ) {
                System.out.print(  "[" + row + "]" + "[" + col + "] " + items[row][col] + " " );
            }
            System.out.println();
        }

        /*
        * [0][1] item1, [0][1] item2
        * item3, item4
        *
        * */

    }

}
