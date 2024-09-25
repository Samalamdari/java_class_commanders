package week_5.day_2.activities;

public class ModifyTheStringUsingReplace {

    public static void main(String[] args) {

        String message = "hello Welcome TO Java Class!1231231!@#12352354";

        // To Print only lowerCase characters
        System.out.println( message.replaceAll("[^a-z]", ""));

        // To Print only upperCase characters
        System.out.println( message.replaceAll("[^A-Z]", ""));

        // To Print only numbers
        System.out.println( message.replaceAll("[^0-9]", ""));

        // To Print only special characters
        System.out.println( message.replaceAll("[A-Za-z0-9]", "").replace(" ", ""));

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

        // Print lowerCase character using forEach loop
        System.out.print( "Lowercase characters: ");
        for ( char character : message.replace(" ", "").toCharArray() ) {
            if ( Character.isLowerCase(character) ) {
                System.out.print(character + " " );
            }
        }

        System.out.println();

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

        // Print upperCase character using forEach loop
        System.out.print( "UpperCase characters: ");
        for ( char character : message.replace(" ", "").toCharArray() ) {
            if ( Character.isUpperCase(character) ) {
                System.out.print(character  + " " );
            }
        }

        System.out.println();

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

        // Print numbers using forEach loop
        System.out.print( "Numbers: ");
        for ( char character : message.replace(" ", "").toCharArray() ) {
            if ( Character.isDigit(character) ) {
                System.out.print(character  + " " );
            }
        }

        System.out.println();

        System.out.println( " * * * * * *  * * * * * *  * * * * * *  * * * * * * " );

    }

}
