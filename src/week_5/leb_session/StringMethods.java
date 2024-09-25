package week_5.leb_session;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String firstName = "Tony";
        String message = "                Java is easy 1123 JJJJJ!@#!@#  JavaADBCEAEE               ";

        System.out.println( firstName.charAt(0) );
        System.out.println( firstName.toUpperCase() );
        System.out.println( firstName.toLowerCase() );

        message = message.trim();

        System.out.println( message );

        System.out.println( message.replace('J', 'j') );
        System.out.println( message.replace("Java", "Python") );
        System.out.println( message.replaceFirst("J", "j") );
        System.out.println( message.replaceFirst("Java", "TypeScript") );
        System.out.println( message.replaceAll("[^A-Z]", "") );
        System.out.println( message.replaceAll("[^a-z]", "") );
        System.out.println( message.replaceAll("[^0-9]", "") );
        System.out.println( message.replaceAll("[A-Za-z0-9]", "") );

        System.out.println( "Original Value of message: " + message );
        System.out.println( "Original Value of message: " + message.replace(" ", "") );


        for ( String word : message.split(" ") ) System.out.println( word );

        for ( char character : message.toCharArray() ) System.out.println( character );

        char[] characters = message.toCharArray();
        System.out.println(Arrays.toString(characters));

        System.out.println( message.length() );
        System.out.println( message.replace(" ", "").length() );

        System.out.println( "UpperCase characters: " + message.replaceAll("[^A-Z]", "").length() );
        System.out.println( "LowerCase characters: " + message.replaceAll("[^a-z]", "").length() );
        System.out.println( "Numbers: " + message.replaceAll("[^0-9]", "").length() );
        System.out.println( "Special characters: " +  message.replaceAll("[A-Za-z0-9]", "").length() );


    }

}
