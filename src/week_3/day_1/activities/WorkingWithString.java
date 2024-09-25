package week_3.day_1.activities;

public class WorkingWithString {

    public static void main(String[] args) {

        int number = 50; // Declaration + Initialization
        String firstName = "Tony";  // Declaration + Initialization

        number = 100; // Modification

        System.out.println( firstName );

        // Modification
        firstName = "Trevor";

        System.out.println( firstName );

        // Combine the value of firstName with another String
        System.out.println( firstName + " Commanders!" );

        // Modification
        firstName = firstName + " Commanders student!";

        System.out.println( firstName );

        // add a number at the end of the string value
        // add space between the number and student!
        firstName = firstName + " " + 1.5;

        System.out.println( firstName );

        // Operations
        String lastName = "Bob  ";

        // Print bob in uppercase format
        // Expected result: BOB

        System.out.println( lastName.length() ); // --> the count of the characters in String including space.
        System.out.println( lastName.toUpperCase() );
        System.out.println( lastName.toLowerCase() );
        System.out.println( lastName );

        System.out.println( lastName.replace(" ", "").length() );

        String message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type " +
                "and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic t" +
                "ypesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

        System.out.println( "Count with spaces: " + message.length() );
        System.out.println( "Count without spaces: " + message.replace(" ", "").length() );


    }

}
