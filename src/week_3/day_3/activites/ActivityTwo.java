package week_3.day_3.activites;

public class ActivityTwo {

    /*
    Activity 2: Narrowing Casting

    Objective: Practice manual casting and observe potential data loss.

    Instructions:

    1. Declare a variable of type double and assign it a value with decimal places.
    2. Declare a variable of type int.
    3. Explicitly cast the double variable to int and assign it to the int variable.
    4. Print both variables and observe the results.

*/

    public static void main(String[] args) {

        double doubleNumber = 1000.512312313112313;
        int intNumber;

        intNumber =  (int) doubleNumber;

        System.out.println( doubleNumber );
        System.out.println( intNumber );

    }

}
