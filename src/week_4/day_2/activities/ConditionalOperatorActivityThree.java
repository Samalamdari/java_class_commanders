package week_4.day_2.activities;

import java.util.Scanner;

public class ConditionalOperatorActivityThree {

    /*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
    */

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables for color inputs and favorite color
        String firstColor = "",
                secondColor = "",
                userFavoriteColor = "";

        // Define the color options
        String color1 = "Blue";
        String color2 = "Red";
        String favoriteColor = "";

        // Determine the favorite color using the conditional operator
        favoriteColor = (color1.equals("Red")) ? color1 : color2; // Since color1 is "Blue", it will return color2 ("Red")

        // Print the determined favorite color
        System.out.println("Your favorite color is: " + favoriteColor);

        // Print a decorative line
        System.out.println(" * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  ");

        // Prompt user to enter the first color
        System.out.print("Enter the first color: ");
        firstColor = input.next();

        // Prompt user to enter the second color
        System.out.print("Enter the second color: ");
        secondColor = input.next();

        // Prompt user to enter their favorite color among the two entered colors
        System.out.print("Enter your favorite color among " + firstColor + " and " + secondColor + ": ");
        favoriteColor = input.next();

        // Print the user's favorite color among the two entered colors
        System.out.println("Your favorite color among " + firstColor + " and " + secondColor + " is = " + favoriteColor);

        // Print a decorative line
        System.out.println(" * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  ");

    }

}
