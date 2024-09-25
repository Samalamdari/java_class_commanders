package week_4.day_1.activities;

import java.util.Scanner;

public class PrintDaysOfTheWeek {

    /*
    * 1 - 7
    * Where 1 is Saturday
    * and 7 is Friday
    * */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.print("Please enter a number to print a day: ");
        userInput = input.nextInt();

        if ( userInput == 1 )  System.out.println("Saturday");
         else if ( userInput == 2 ) System.out.println("Sunday");
         else if ( userInput == 3 ) System.out.println("Monday");
         else if ( userInput == 4 )  System.out.println("Tuesday");
         else if ( userInput == 5 )  System.out.println("Wednesday");
         else if ( userInput == 6 )  System.out.println("Thursday");
         else if ( userInput == 7 )  System.out.println("Friday");
         else System.out.println("Invalid value, please enter a number between 1 to 7!");

         switch ( userInput ) {
             case 1:
                 System.out.println("Saturday");
                 break;
             case 2:
                 System.out.println("Sunday");
                 break;
             case 3:
                 System.out.println("Monday");
                 break;
             case 4:
                 System.out.println("Tuesday");
                 break;
             case 5:
                 System.out.println("Wednesday");
                 break;
             case 6:
                 System.out.println("Thursday");
                 break;
             case 7:
                 System.out.println("Friday");
                 break;
             default:
                 System.out.println("Invalid value, please enter a number between 1 to 7!");
         }

    }

}
