package week_4.day_3.activities;

import java.util.Scanner;

public class OrLogicalOperatorExampleTwo {

    public static void main(String[] args) {

        /*
        *
        * 90 -- 100 --> A
        * 80 -- 89 --> B
        * 70 -- 79 --> C
        *  F
        *
        * */

        var input = new Scanner(System.in);
        int score = 0;
        char grade = 0;

        System.out.print("Please enter your score to see your grade: ");
        score = input.nextInt();

//        if ( ( score >= 90 ) || ( score <= 100 ) ) grade = 'A';
//        else if ( ( score >= 80 ) || ( score <= 89 ) ) grade = 'B';
//        else if ( ( score >= 70 ) || ( score <= 79 ) ) grade = 'C';
//        else grade = 'F';

        if ((score > 100) || (score < 0)) System.out.println("Failed");
        else if ( ( score >= 90 ) && ( score <= 100 ) ) grade = 'A';
        else if ( score >= 80 ) grade = 'B';
        else if ( score >= 70 ) grade = 'C';
        else grade = 'F';

        /*
        *  -1 --> F
        *  101 --> B
        * */

        System.out.println("Your grade is: " + grade);

        System.out.println( " * * * * *   * * * * *  * * * * *  * * * * *  ");

        if ( ( score >= 90 ) && ( score <= 100 ) ) grade = 'A';
        else if ( ( score >= 80 ) || ( score <= 89 ) ) grade = 'B';
        else if ( ( score >= 70 ) || ( score <= 79 ) ) grade = 'C';
        else {
            grade = 'F';
            System.out.println("Failed");
        }

        System.out.println("Your grade is: " + grade);

        // 101
        // 100 1
        // 1001
        // String -> 100 1
        System.out.println("100 1");


    }

}
