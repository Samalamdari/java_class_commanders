package week_2.day_3.activities;

public class WorkingWithNonPrimitiveDataTypes {

    public static void main(String[] args) {

        // Non-Primitive Data Types
        String firstName = "Tony";
        String className = "Commanders";

        // length -->  1 2 3 4 ==> Length = 4
        //  VALUE -->  T O N Y
        //  index -->  0 1 2 3 ==> We have 4 characters in this location, where each one is having their own index ( position || address )

        // Access specific character in firstName
        System.out.println( firstName.charAt(0) ); // n
        System.out.println( firstName.charAt(1) ); // n
        System.out.println( firstName.charAt(2) ); // n
        System.out.println( firstName.charAt(3) ); // n

        // How to get the length of the firstName
        // or how to know how many characters are stored in that specific variable?

        System.out.println( firstName.length() );

        String fullName = "Trevor Morphy";

        System.out.println( fullName );

        System.out.println( fullName.length() );

        // Access specific character through the index (address || position )
        System.out.println( fullName.charAt(11) ); // h


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * * * * " );

        // Declaring an array of String that contains 4 values
        // Length (count)         -->     1            2          3          4
        String[] commanderStudents = { "Mohammad", "Shahzad", "Abdullah", "Aseel" };
        // index (position)       -->     0            1          2          3

        System.out.print( commanderStudents[2] + " " ); // Abdullah
        System.out.print( commanderStudents[3] ); // Aseel

        System.out.println(); // Jump into a new line

        System.out.println( commanderStudents[2] + " " + commanderStudents[3] ); // Abdullah Aseel

        // Print the count of the values in that location ( commanderStudents )
        System.out.println( commanderStudents.length );

        // Print the count of the characters stored in the second location in array ( commanderStudents )
        System.out.println( commanderStudents[1].length() );


        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * * * * " );



    }


}
