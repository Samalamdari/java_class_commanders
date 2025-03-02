package test_and_practice_for_interview.interview_Max_and_Min_value_in_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MaxAndMinValueInMap {

    private static final String message = "Heelllllooo";
    private static final Map<Character,Integer> countCharactersMap = new HashMap<>();

    // way 1:
    private static void addCharactersToMap() {
        for (char character : message.toCharArray()) {
            if (countCharactersMap.containsKey(character)) {
                countCharactersMap.put(character,countCharactersMap.get(character) + 1);
            }else {
                countCharactersMap.put(character, 1);
            }
        }
    }
    // way 2:
    private static void addCharactersToMapSolutionTwo() {
        for (char character : message.toCharArray()) countCharactersMap.merge(character,1,Integer::sum);
    }

    // way 1: for print
    private static void printEntriesOfMap() {
        for (Map.Entry<Character,Integer> entry : countCharactersMap.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    //  way 1 : find Max value
    private static void findAndPrintMaxCharacterCount() {
        Map.Entry<Character,Integer> entry = countCharactersMap.entrySet().iterator().next();
        char maxCharacter = entry.getKey();
        int maxCharacterCount = entry.getValue();

        for (Map.Entry<Character,Integer> eachEntry : countCharactersMap.entrySet() ) {
            final char character = eachEntry.getKey();
            final int characterCount = eachEntry.getValue();

            if (characterCount > maxCharacterCount) {
                maxCharacter = character;
                maxCharacterCount = characterCount;
            }
        }
        System.out.println("Max character: " + maxCharacter + " with count --> " + maxCharacterCount);
    }
    // way 1 : find Min value
    private static void findAndPrintMinCharacterCount() {
        Map.Entry<Character,Integer> entry = countCharactersMap.entrySet().iterator().next();
        char minCharacter = entry.getKey();
        int minCharacterCount = entry.getValue();

        for (Map.Entry<Character,Integer> eachEntry : countCharactersMap.entrySet() ) {
            final char character = eachEntry.getKey();
            final int characterCount = eachEntry.getValue();

            if (characterCount < minCharacterCount) {
                minCharacter = character;
                minCharacterCount = characterCount;
            }
        }
        System.out.println("Min character: " + minCharacter + " with count --> " + minCharacterCount);
    }

    // way 2 : find Max value
    private static void findAndPrintMaxCharacterCountSolutionTwo() {
        Optional<Map.Entry<Character, Integer>> maxEntry = countCharactersMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        maxEntry.ifPresent( entry ->
                System.out.println(entry.getKey() + " --> " + entry.getValue())
        );
    }
    // way 2 : find Min value
    private static void findAndPrintMinCharacterCountSolutionTwo() {
        Optional<Map.Entry<Character, Integer>> minEntry = countCharactersMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue());
        minEntry.ifPresent( entry ->
                System.out.println(entry.getKey() + " --> " + entry.getValue())
        );
    }
    // way 3 : find Max value
    private static void findAndPrintMaxCharacterCountSolutionThree() {
        Map.Entry<Character,Integer> maxEntry = Collections.max(countCharactersMap.entrySet(),Map.Entry.comparingByValue());
            System.out.println(maxEntry.getKey() + " --> " + maxEntry.getValue()
        );
    }
    // way 3 : find Min value
    private static void findAndPrintMinCharacterCountSolutionThree() {
        Map.Entry<Character,Integer> minEntry = Collections.min(countCharactersMap.entrySet(),Map.Entry.comparingByValue());
        System.out.println(minEntry.getKey() + " --> " + minEntry.getValue()
        );
    }


    // way 2 : for print
    private static void printEntriesOfMapSolutionTwo() {
        countCharactersMap.forEach((k, v) -> System.out.println(k + " --> " + v));
    }

    public static void main(String[] args) {

     // way 1:
//        addCharactersToMap();
//        printEntriesOfMap();

        // way 2:
        addCharactersToMapSolutionTwo();
        printEntriesOfMapSolutionTwo();

        // this character x has the highest value --> z
        // while the x is the character and z is the value.
        // create two separate methods for both highest and lowest counts.

        // way 1:
        findAndPrintMaxCharacterCount();
        findAndPrintMinCharacterCount();

        // way 2:
        findAndPrintMaxCharacterCountSolutionTwo();
        findAndPrintMinCharacterCountSolutionTwo();

        // way 3 :
        findAndPrintMaxCharacterCountSolutionThree();
        findAndPrintMinCharacterCountSolutionThree();
    }



}
