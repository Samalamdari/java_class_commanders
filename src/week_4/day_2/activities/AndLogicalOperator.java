package week_4.day_2.activities;

public class AndLogicalOperator {

    public static void main(String[] args) {

        /*
         * AND Logical Operator --> Returns true if two or more than two conditions are true, if one side is false
         * it will return false.
         * */

        // Print header for the AND logical operator table
        System.out.println(" * * * * * * * * * * AND Logical Operator Table * * * * * * * * * * ");
        System.out.println("  * * * * * Condition  * * * * * Condition  * * * * * RESULT * * * * ");

        // Print the result of true && true
        System.out.println( "true" + " && true: " + (true && true) );

        // Print the result of true && false
        System.out.println( "true" + " && false: " + (true && false) );

        // Print the result of false && true
        System.out.println( "false" + " && true: " + (false && true) );

        // Print the result of false && false
        System.out.println( "false" + " && false: " + (false && false) );

        // Conditional check using AND operator
        if ( false && false ) {
            // This block will not execute
            System.out.println("truth block executed");
        } else {
            // This block will execute
            System.out.println("Either one or both side of the conditions are false");
        }

    }

}
