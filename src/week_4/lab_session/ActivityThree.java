package week_4.lab_session;

import java.util.Scanner;

public class ActivityThree {

    public static void main(String[] args) {

        double[] temperature = new double[7];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enether the temperature for each day of the week: ");
        for ( int index = 0; index < temperature.length; index++ ) {
            System.out.print("Please enter the temperature for the day " + ( index + 1 ) +  ": ");
            temperature[index] = input.nextDouble();
        }

        System.out.println("The temperature for the fourth day is: " +  temperature[3] );


    }
}
