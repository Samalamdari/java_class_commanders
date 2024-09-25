package week_7.day_3.activities;

public class WorkingWithString {

    public static void main(String[] args) {

        String message = "Welcome commanders!";
        String upperCaseVersion = "";

        printUpperCaseMessage(message);

        upperCaseVersion = upperCaseVersionOfString(message);

        System.out.println( upperCaseVersion );

        System.out.println( upperCaseVersionOfString(message) );

        String className = "COMMANDERS";

        System.out.println( className.length() );



        System.out.println(  className.toLowerCase() );


    }

    public static void printUpperCaseMessage( String str ) {
        System.out.println( str.toUpperCase() );
    }

    public static String upperCaseVersionOfString( String str ) {
         return str.toUpperCase();
    }

}
