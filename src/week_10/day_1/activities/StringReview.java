package week_10.day_1.activities;

public class StringReview {

    public static void main(String[] args) {

        String immutable = new String("Bob");
        String immutableTwo = "Bob";

        System.out.println( immutable == immutableTwo  );
        System.out.println( immutable.equals(immutableTwo)  );

        // Mutable Strings, Changeable Strings
        StringBuilder strBuilder = new StringBuilder();
        StringBuffer strBuffer = new StringBuffer();


        strBuilder.append("Tony"); // 110 --> Tony Morphy

        System.out.println( strBuilder );

        strBuilder.append(" Morphy");

        System.out.println( strBuilder );

        System.out.println( strBuilder.length() );

        System.out.println( strBuilder.indexOf("Tony") );

        System.out.println( strBuilder.insert(0, "Hello ") );

        System.out.println( strBuilder );


        String str = strBuilder.toString(); // Normal String, store the value of String Builder




    }

}
