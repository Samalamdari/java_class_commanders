package week_3.day_3.activites;

public class ActivityOne {

    /*
    *
    * Activity 1: Widening Casting
    Objective: Understand how Java automatically casts from smaller to larger data types.
    Instructions:
    1. Declare a variable of type int and assign it a value.
    2. Declare a variable of type double.
    3. Assign the int variable to the double variable without using explicit casting.
    4. Print both variables and observe the results.
    */

    public static void main(String[] args) {


        int intNumber = 15;
        double doubleNumber;

        doubleNumber = intNumber; // 15.0

        System.out.println( "Int value: " + intNumber );
        System.out.println( "Double value: " + doubleNumber );


    }


}
