package week_7.day_2.activities;

import java.util.Map;
import java.util.TreeMap;

public class MapConfig {

    TreeMap<Character, Integer> sortedCharacters = new TreeMap<>();


    public String filterStringBasedOnLowerCaseAndUppercaseCharacters( String str ) {
        return str.replaceAll("[^A-Za-z]", "");
    }

    public String filterStringBasedOnUppercaseCharacters( String str ) {
        return str.replaceAll("[^A-Z]", "");
    }

    public void addUpperCaseAndLowerCaseCharactersToTreeMap( String str ) {
        for ( char character : filterStringBasedOnLowerCaseAndUppercaseCharacters(str).toCharArray() ) {
            if ( sortedCharacters.containsKey(character) ) {
                sortedCharacters.put(character, sortedCharacters.get(character) + 1);
            } else {
                sortedCharacters.put(character, 1);
            }
        }
    }

    //    public static void printEntriesOfMap( TreeMap<Character, Integer> map ) {
//        for ( Map.Entry<Character, Integer> entry : map.entrySet() ) {
//            System.out.println( entry.getKey() + " - " + entry.getValue() );
//        }
//    }

    public void printEntriesOfMap() {
        for ( Map.Entry<Character, Integer> entry : sortedCharacters.entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }
    }


}
