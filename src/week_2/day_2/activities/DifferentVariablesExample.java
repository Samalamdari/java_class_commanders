package week_2.day_2.activities;

public class DifferentVariablesExample {

    // Instance variable
    String lastName = "Morphy";

    // Class Level Variable
    static String middleName = "MiddleNameTest";


    public static void main(String[] args) {

        // Local variable
        String name = "Tony";
        System.out.println( name );

        // Access lastName
        // Create an object of the class if you would like to use an instance variable
        // Syntax for creating object
        // NameOfTheClass nameofTheObject = new NameOfTheClass();
        DifferentVariablesExample obj = new DifferentVariablesExample();
        System.out.println( obj.lastName );

        // Access middleName ( class level variable )
        System.out.println( middleName );

    }

}
