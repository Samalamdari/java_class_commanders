package week_4.day_2.activities;

import java.util.Scanner;

public class ConditionalStatementWithMultipleConditions {

    public static void main(String[] args) {

        // Calculate the grade based on the score

        // Arrange the data in which we need in order to execute our program
        Scanner input = new Scanner(System.in);
        int score;
        char grade;

        // Aks the user of the input
        System.out.print("Please enter your score: ");
        score = input.nextInt();

        // Find the grade base on the score
        grade =  ( score >= 90 ) ? 'A' :
                 ( score >= 80 ) ? 'B' :
                 ( score >= 70 ) ? 'C' :
                 ( score >= 60 ) ? 'D' :
                 'F' ;


        // Print the result
        System.out.println( "Your grade is: " + grade );

    }

}
