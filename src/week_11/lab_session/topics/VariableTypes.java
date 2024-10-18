package week_11.lab_session.topics;

public class VariableTypes {

    String lastName; // Instance variable --> They belong to object? You need to create object of the class to use
    // instance variables.
    static int salary; // Static Variable/ Class level variable --> This variable does not belong to object.
    // It simply belongs to the class.

    public static void main(String[] args) {

        String firstName; // Local Variable
        firstName = "John";

        // Syntax for creating object
        // NameOfYourClass nameOFObject = new NameOfYourClass();
        VariableTypes variableObj = new VariableTypes();

        System.out.println( firstName );

        variableObj.lastName = "Alexander";

        System.out.println( variableObj.lastName );

        salary = 17_000;

        System.out.println( salary );

        if ( true ) { // If Statement block starts

            int age = 10; // Local to if statement block

            System.out.println( age );

            age = age + 20;

            System.out.println( age );

            System.out.println( firstName );

        } // If Statement block ends

       // System.out.println( age ); // is no longer available.

        System.out.println( firstName );




    } // Main method block ends

}
