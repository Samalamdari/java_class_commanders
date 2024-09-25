package week_5.leb_session;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithScannerAndArray {

    public static void main(String[] args) {

        /*
        * AAA
        * */

        var input = new Scanner(System.in);
        int itemCount;

        System.out.print("How many items do you have: ");
        itemCount = input.nextInt();

        String[] items = new String[itemCount];

        System.out.println("Please enter " +  items.length  + " items:");

        for ( int index = 0; index <= items.length - 1; index++ ) {
            System.out.print("Item " + ( index + 1 )  + ": ");
            items[index] = input.next();
        }

        System.out.println( Arrays.toString(items) );

    }

}
