package week_4.day_2.activities;

public class IfStatementReview {

    public static void main(String[] args) {

        /*
        * if statement
        * if ( condition ) {
        *           // truth block
        *   } else {
        *
        *   }
        * */

        int score = 60;
        if ( score >= 90 ) {
            System.out.println("Grade: A");
            if ( true ) {
                System.out.println("If executed");
            } else {
                System.out.println("Else executed");
            }
        } else if ( score >= 80 ) { // 80 - 89
            System.out.println("Grade: B");
        } else if ( score >= 70 ) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Your score dosen't match any of the grading systems!");
        }

        System.out.println("Normal execution");

    }

}
