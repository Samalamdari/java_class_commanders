package week_11.lab_session.topics;

public class WorkingWithStrings {

    public static void main(String[] args) {

        String message = "   Welcome to TTEKSchool!@@#123  ";
        String name = "John";

        //  print the length of the String, length() will give us the size or the number of characters being used in String
        // including spaces.
        System.out.println( message.length() );
        System.out.println( name.length() );

        // Print/Get specific character at a location --> Location --> index --> Starts from 0
        System.out.println( message.charAt(3) );
        System.out.println( message.charAt(12) );
        char characterAtIndexNumberThree = message.charAt(3);

        // Print/Get a range of characters from a String
        System.out.println( message.substring(6) );
        System.out.println( message.substring(6, 12) );

        // LowerCase version of String
        System.out.println( message.toLowerCase() );

        // UpperCase version of String
        System.out.println( message.toUpperCase() );

        // Remove extra spaces before and after the string
        System.out.println( message.trim() );

        // Remove spaces between each word
        System.out.println( message.replace(" ", "") );
        System.out.println( message.replace('T', 't') );

        System.out.println( message.replaceAll("T", "t") );
        System.out.println( message.replaceAll("[^A-Z]", "") );
        System.out.println( message.replaceAll("[^a-z]", "") );
        System.out.println( message.replaceAll("[^0-9]", "") );
        System.out.println( message.replaceAll("[A-Za-z0-9]", "").trim() );


    }

}

