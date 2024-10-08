package week_10.day_1.activities;

public class ReverseString {

    public static void main(String[] args) {

        String message = "Hello Humans!";

        System.out.println( reverseString(message) );

//        System.out.println( reverseString("TekSchool") );
//        System.out.println( reverseString("Humans!") );
//        System.out.println( reverseString("JavA") );

        System.out.println( reverseStringVersionTwo(message) );

        System.out.println( reverseStringThree(message) );
    }


    public static String reverseString( String str ) {
        String reversedString = "";

        for ( int index = str.length() - 1; index >= 0; index-- ) {
//            reversedString = reversedString + message.charAt(index);
            reversedString += str.charAt(index);
            System.out.println(  (index + 1) + " ==> " +  reversedString );
        }

        return reversedString;
    }

    public static StringBuilder reverseStringVersionTwo(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        return strBuilder.reverse();
    }

    public static String reverseStringThree( String str ) {
        String reversedString = "";

        for ( int index = 0; index < str.length() - 1; index++) {
            reversedString =  str.charAt(index) + reversedString;
        }

        return reversedString;
    }

}
