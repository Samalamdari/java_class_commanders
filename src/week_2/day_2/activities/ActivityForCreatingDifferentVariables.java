package week_2.day_2.activities;

public class ActivityForCreatingDifferentVariables { // Class block opened


    // Declare an initialize three different variable types
    /*
    * 1: Local Variable     --> Variable belong to method
    * 2: Instance Variable   --> Variable belong to object
    * 3: Class level Variable  --> Variable belong to class
    * */

    // Instance variable
    String lastName;

    // Class level variable
    static int score = 50;


    public static void main(String[] args) { // main block opened

        // Local Variable
        String firstName = "Tony";
        System.out.println( firstName );

        ActivityForCreatingDifferentVariables obj = new ActivityForCreatingDifferentVariables();
        System.out.println( obj.lastName );

        System.out.println( score );

    } // main block closed

   //  System.out.println( firstName ); || --> Cannot be accessed because the lifetime of the firstName is already ended


} // class block closed
