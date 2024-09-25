package week_3.lab_session;

import java.util.Random; // Import the Random class to generate random numbers

public class RandomGame {

    public static void main(String[] args) {

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer between 1 and 9 (inclusive)
        // The nextInt method generates a random integer between 0 (inclusive) and the specified bound (exclusive)
        // To get a number between 1 and 10, use the formula: (max - min) + min
        // Here, the bound is 10 - 1 (i.e., 9), and we add 1 to shift the range to 1 to 10
        int number = random.nextInt(10 - 1) + 1;

        // Print the randomly generated number
        System.out.println("Random Generated Number is: " + number);

    }

}
