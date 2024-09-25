package week_6.day_1.activities;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isVIP;
        int gameHoursPlayed;
        String userInput;


        System.out.print("Are you a VIP member: (yes / no ): ");
        userInput = input.next();

//        if (userInput.toLowerCase().equals("yes")) isVIP = true;
//        else  isVIP = false;

        isVIP=(userInput.toLowerCase(). equals("yes")) ? true : false;

        System.out.println(" Please enter the time you have played the game: ");
        gameHoursPlayed = input.nextInt();

        System.out.println("***** ****** ******* ******** ********* ******** ");

        if (isVIP || gameHoursPlayed > 100) System.out.println(" Game level Accessed!");
        else System.out.println("Either you are not a VIP member or you haven't Played the game enough! ");







    }

}
