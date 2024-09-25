package week_5.day_2.activities;

import java.util.Scanner;

public class ForLoopWithScanner {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int start, end, desiredNumber;
//        int end;

        System.out.print("Which number would you like me to print the multiplication table for: ");
        desiredNumber = input.nextInt();

        System.out.print("From where do you need me to start printing the table: ");
        start = input.nextInt();

        System.out.print("When do you need me to stop printing the table: ");
        end = input.nextInt();
        
        for ( int i = start; i <= end; i++ ) {
            System.out.println( i + " * " + desiredNumber + " = " + ( i * desiredNumber ) );
        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

        for ( int i = end; i >= start; i-- ) {
            System.out.println( i + " * " + desiredNumber + " = " + ( i * desiredNumber ) );
        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );


//        for ( int number = 10; number >= 1; number-- ) {
//            System.out.println( number );
//        }

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  * * * * * *  " );

    }

}
