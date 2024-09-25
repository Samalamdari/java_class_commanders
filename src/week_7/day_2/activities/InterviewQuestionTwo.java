package week_7.day_2.activities;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestionTwo {

    public static void main(String[] args) {

        String message = "Welcome to Commanders Class123#$%!@!#!";
        Map<Character, Integer> countCharacters = new HashMap<>();

        for ( char character : message.replaceAll("[^A-za-z]", "").toCharArray() ) {
                countCharacters.merge(character, 1, Integer::sum);
        }

        countCharacters.forEach( ( k, v ) -> System.out.println( k + " - " + v ));

    }

}
