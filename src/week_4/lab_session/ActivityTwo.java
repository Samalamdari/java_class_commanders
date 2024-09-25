package week_4.lab_session;

import java.util.Scanner;

public class ActivityTwo {

    /*
    Temperature Logger:

    Objective: Store daily average temperatures for a week and retrieve a specific day's temperature.

    Steps:

    Declare a 1D array of size 7. This will represent temperatures for seven days.
    Assign a temperature value to each day.
    To find the temperature on the 4th day, access the element at index 3 (since array indices start from 0).
    Print the temperature value retrieved from the array.

    NOTE: You need to use scanner to enter the temperature for each day and store them into 1D Array.

 */

    public static void main(String[] args) {

        // n - 1 ==> 7 - 1 ==> 6
        double[] temperature = new double[7];
        Scanner input = new Scanner(System.in);
        double fourthDayTemperature;

        System.out.print("Please enter the temperature for the day 1: ");
        temperature[0] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 2: ");
        temperature[1] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 3: ");
        temperature[2] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 4: ");
        temperature[3] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 5: ");
        temperature[4] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 6: ");
        temperature[5] = input.nextDouble();

        System.out.print("Please enter the temperature for the day 7: ");
        temperature[6] = input.nextDouble();

        fourthDayTemperature = temperature[3];

        System.out.println("The temperature for the fourth day is: " +  fourthDayTemperature);
        System.out.println("The temperature for the fourth day is: " +  temperature[3] );

        System.out.println("The temperature for the fourth day is: " + (int) fourthDayTemperature);
        System.out.println("The temperature for the fourth day is: " + (int) temperature[3] );

    }

}
