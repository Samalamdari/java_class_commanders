package week_7.day_2.activities;

import java.util.*;

public class InterviewQuestion {

    public static void main(String[] args) {

        String message = "zWelcome to Commanders Class123#$%!@!#!";
        Map<Character, Integer> countCharacters = new HashMap<>();
        Map<Character, Integer> sortedCharacters = new TreeMap<>();

        // Count the number of characters only
        // W - 2
        // 2 - W

        System.out.println( message.replaceAll("[^A-Za-z]", "") );
        System.out.println( message.replaceAll("[^A-Z]", "") );
        System.out.println( message.replaceAll("[^a-z]", "") );
        System.out.println( message.replaceAll("[^0-9]", "") );
        System.out.println( message.replaceAll("[A-Za-z0-9]", "").replace(" ", "") );
//        System.out.println( message.replaceAll("[^A-z]", "") );

        for ( char character : message.replaceAll("[^a-z]", "").toCharArray() ) {
            if ( sortedCharacters.containsKey(character) ) {
                sortedCharacters.put(character, sortedCharacters.get(character) + 1);
            } else {
                sortedCharacters.put(character, 1);
            }
        }

        System.out.println( sortedCharacters );

        for ( Map.Entry<Character, Integer> entry : sortedCharacters.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }



    }

}
