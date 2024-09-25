package week_4.day_3.activities;

import java.util.Scanner;

public class PlanningPicnic {

        /*
    *   Question: Planning a Picnic

        You check the weather forecast and find out two details:
        *
        boolean isSunny = true; (This indicates if the day is sunny.)
        boolean isPleasantTemperature = false; (This indicates if the temperature is pleasant.)
        *
        Determine if:
        *
        Both conditions are met for a perfect picnic.
        At least one condition is favorable.
        The weather is not sunny.
        Based on the conditions, decide if you'll go on the picnic or postpone it.
        Print out your decision.
    * */

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        boolean isSunny;
        boolean isPleasantTemperature;
        int userChoice;

        System.out.println("Is weather sunny?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please enter your answer: ");
        userChoice = input.nextInt();

        isSunny =  ( userChoice == 1 ) ? true : false;

        System.out.println("Is weather Pleasant?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Please enter your answer: ");
        userChoice = input.nextInt();

        isPleasantTemperature =  ( userChoice == 1 ) ? true : false;


        if ( isSunny && isPleasantTemperature ) System.out.println("Yes, we can go for a picnic!");
        else if ( isSunny || isPleasantTemperature ) System.out.println("Yes, we can go for a picnic!");
        else System.out.println("No, we cannot go out!");


    }

}
