package week_6.day_1.activities;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int computerGuessedNumber = random.nextInt(( 100 - 1) + 1);
        int userGuess = 0;
        int numberOfTries = 0;
        int score = 100;

        System.out.println(" * * * * *  * * * * * Welcome to guessing game!  * * * * *  * * * * * ");
        System.out.println("I have selected a number between 1 to 100, try to guess the correct number!");
        System.out.println("Remember, after each incorrect tries, you will lose 10 points out of 100!");

        while ( userGuess != computerGuessedNumber ) {

            System.out.print("Guess the number: ");
            userGuess = input.nextInt();
            numberOfTries++;

            if (userGuess > computerGuessedNumber) {
                System.out.println("Too high, go low!");
                score -= 10;
            } else if (userGuess < computerGuessedNumber) {
                System.out.println("Too low, go high");
                score -= 10;
            } else {
                System.out.println("Congrats, you have found the number!");
//                System.out.println("The lucky number is: " + userGuess);
//                System.out.println("It took you " + numberOfTries + " tries to find the correct number.");
//                System.out.println("Your score is: " + score);
            }

        }


    }

}
