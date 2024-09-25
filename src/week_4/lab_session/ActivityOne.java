package week_4.lab_session;

import java.util.Scanner;

public class ActivityOne {

    /*
    Online Game Access

    Objective: Check if a user can access a specific level in an online game.

    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.

    The user provides their details:

    boolean isVIP = false;
    int gameHoursPlayed = 105;

    (Both values can be changed for testing)

    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isVIP;
        int gameHoursPlayed;
        String userInput;

        System.out.print("Are you a VIP member ( yes / no ): "); // YES
        userInput = input.next();

//        if ( userInput.toLowerCase().equals("yes") ) isVIP = true;
//        else isVIP = false;

        isVIP = ( userInput.toLowerCase().equals("yes") ) ? true : false;

        System.out.print("Please enter the time you've played the game: "); // YES
        gameHoursPlayed = input.nextInt();

        System.out.println(" * * * * * *  * * * * * *  * * * * * *  * * * * * *  ");

        if ( isVIP || gameHoursPlayed > 100 ) System.out.println("Game level accessed!");
        else System.out.println("Either you're not a VIP member or you haven't played the game enough!");


    }



}
