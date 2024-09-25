package week_3.lab_session;

import java.util.Random; // Import the Random class for generating random numbers

public class PrintRandomCharactersOfString {

    /*
     *
     *  Write a Java program that prints random characters from a String
     *  String str = "Hello World";
     *
     *  Expected output:
     *   H
     *   l
     *   d
     *
     * */

    public static void main(String[] args) {

        // Create an instance of the Random class
        Random random = new Random();

        // Declare an integer variable to store the random index
        int randomIndex;

        // Initialize a String variable with the value "Hello World"
        String str = "                        Hello World                             ";

        // Calculate a random index to select a character from the string
        // The nextInt method generates a random integer between 0 (inclusive) and the length of the string (exclusive)
        // To generate a random index, use: random.nextInt(str.length())
        // str.length() gives the total number of characters in the string, so the valid indices are from 0 to length-1
        // the formula if you want to generate between specific range ( max - min ) + min
        // randomIndex = random.nextInt( str.length() - 1 - 0 ) + 0;
        // or you can call the length() directly.
        str = str.replaceAll(" ", "").trim();
        randomIndex = random.nextInt(str.length());


        // Print the character at the randomly generated index
        // The charAt method retrieves the character at the specified index from the string
        System.out.println("Random Character: " + str.charAt(randomIndex));

    }

}
