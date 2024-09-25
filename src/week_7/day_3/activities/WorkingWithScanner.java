package week_7.day_3.activities;

import java.util.Scanner;

public class WorkingWithScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName = askTheUserForFirstName(input);
        System.out.println( firstName );

    }

    public static String askTheUserForFirstName( Scanner scanner ) {
        System.out.print("Please enter your name: ");
        return scanner.next();
    }

}
