package week_4.day_3.activities;

import java.util.Scanner;

public class BasicDecisionMaking {

        /*
        *   1. Basic Decision Making:
         *
        You are creating a weather application. Based on the temperature, suggest what to wear.
        * If the temperature is below 10 degrees, display "Wear a heavy coat!".
        * If it's between 10 and 20 degrees, suggest "A light jacket will do.".
        * Otherwise, for any temperature above 20 degrees, show "It's warm, just a T-shirt is fine!".
    * */

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int temperature;

        System.out.print("Please enter the temperature: ");
        temperature = input.nextInt();

        if ( temperature < 10 ) System.out.println("Wear a heavy coat!");
        else if ( ( temperature >= 10 ) && ( temperature <= 20 ) ) System.out.println("A light 19jacket will do.");
        else System.out.println("It's warm, just a T-shirt is fine!");


    }


}
