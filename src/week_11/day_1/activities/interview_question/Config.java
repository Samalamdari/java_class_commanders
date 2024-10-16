package week_11.day_1.activities.interview_question;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Config {

    // Fields
    private final String message;
    private final Map<Character, Integer> countCharactersMap;

    // Constructor
    public Config(String message) {
        this.message = message;
        countCharactersMap = new HashMap<>();
        addCharactersToMap();
    }

    private void addCharactersToMap() {
        if ( message == null || message.equals("")) {
            printEmptyMapMessage();
        } else {
            for (char character : message.toCharArray()) {
                if (countCharactersMap.containsKey(character)) {
                    countCharactersMap.put(character, countCharactersMap.get(character) + 1);
                } else {
                    countCharactersMap.put(character, 1);
                }
            }
        }
    }

    private void addCharactersToMapSolutionTwo() {
        for ( char character : message.toCharArray() ) countCharactersMap.merge(character, 1, Integer::sum);
    }

    public  void printEntriesOfMap() {
        for ( Map.Entry<Character, Integer> entry : countCharactersMap.entrySet() ) {
            System.out.println( entry.getKey() + " --> " + entry.getValue() );
        }
    }

    public void findAndPrintMaxCharacterCount() {
        if ( checkIfMapIsEmptyOrNot() ) {
            printEmptyMapMessage();
        } else {
            Map.Entry<Character, Integer> entry = countCharactersMap.entrySet().iterator().next();
            char maxCharacter = entry.getKey();
            int maxCharacterCount = entry.getValue();

            for (Map.Entry<Character, Integer> eachEntry : countCharactersMap.entrySet()) {
                final char character = eachEntry.getKey();
                final int characterCount = eachEntry.getValue();

                if (characterCount > maxCharacterCount) {
                    maxCharacter = character;
                    maxCharacterCount = characterCount;
                }
            }

            System.out.println("Max character: " + maxCharacter + " with count --> " + maxCharacterCount);
        }

    }

    public void findAndPrintMinCharacterCount() {
        if (checkIfMapIsEmptyOrNot()) {
            printEmptyMapMessage();
        } else {
            Map.Entry<Character, Integer> entry = countCharactersMap.entrySet().iterator().next();
            char maxCharacter = entry.getKey();
            int minCharacterCount = entry.getValue();

            for (Map.Entry<Character, Integer> eachEntry : countCharactersMap.entrySet()) {
                final char character = eachEntry.getKey();
                final int characterCount = eachEntry.getValue();

                if (characterCount < minCharacterCount) {
                    maxCharacter = character;
                    minCharacterCount = characterCount;
                }
            }

            System.out.println("Min character: " + maxCharacter + " with count --> " + minCharacterCount);
        }
    }

    public void findAndPrintMaxCharacterCountSolutionTwo() {
        Optional<Map.Entry<Character, Integer>> maxEntry = countCharactersMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        maxEntry.ifPresent( entry ->
                System.out.println( entry.getKey() + " --> " + entry.getValue() )
        );
    }

    public void findAndPrintMinCharacterCountSolutionTwo() {
        Optional<Map.Entry<Character, Integer>> minEntry = countCharactersMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue());
        minEntry.ifPresent( entry ->
                System.out.println( entry.getKey() + " --> " + entry.getValue() )
        );
    }

    public void printEntriesOfMapSolutionTwo() {
        countCharactersMap.forEach(( k, v ) -> System.out.println( k + " --> " + v ));
    }

    public void findAndPrintMaxCharacterCountSolutionThree() {
        if ( checkIfMapIsEmptyOrNot() ) {
            printEmptyMapMessage();
        } else {
            Map.Entry<Character, Integer> maxEntry = Collections.max(countCharactersMap.entrySet(), Map.Entry.comparingByValue());
            System.out.println(maxEntry.getKey() + " --> " + maxEntry.getValue());
        }

    }

    public void findAndPrintMinCharacterCountSolutionThree() {
        if ( checkIfMapIsEmptyOrNot() ) {
        printEmptyMapMessage();
        } else {
            Map.Entry<Character, Integer> minEntry = Collections.min(countCharactersMap.entrySet(), Map.Entry.comparingByValue());
            System.out.println(minEntry.getKey() + " --> " + minEntry.getValue());
        }
    }

    private boolean checkIfMapIsEmptyOrNot() {
        return countCharactersMap.isEmpty();
    }

    private void printEmptyMapMessage() {
        System.out.println("Map is empty, please add some values!");
    }


}
