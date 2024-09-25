package week_7.lab_session.guessinggame;

import java.util.Scanner;

public class UserInput {

    // Attributes
    private final Scanner scanner;

    // Constructor
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int getUserInput() {
        System.out.print("Guess the number: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }

}
