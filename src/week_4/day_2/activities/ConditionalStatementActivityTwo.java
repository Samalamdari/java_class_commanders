package week_4.day_2.activities;


import java.util.Scanner;

public class ConditionalStatementActivityTwo {

    public static void main(String[] args) {


        // Arrange the data in which we need in order to execute our program
        Scanner input = new Scanner(System.in);
        int score;
        char grade;

        // Aks the user of the input
        System.out.print("Please enter your score: ");
        score = input.nextInt();

        // Find the grade base on the score
       grade =  ( score >= 90 ) ? 'A' : 'B';


        // Print the result
        System.out.println("Your grade is: " + grade);
        System.out.println("Your grade is: " + ( ( score >= 90 ) ? 'A' : 'B' ) );


    }

}
