package week_10.day_3.interviewquestions.stringwithcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Config {

    private String[] names;
    private String target;
    private final List<Integer> listOfTargetIndexes;
    private final Map<Character, Integer> countCharacters;

    // Constructor
    public Config(String[] names, String target) {

        setNames(names);
        setTarget(target);
        listOfTargetIndexes = new ArrayList<>();
        countCharacters = new HashMap<>();

        searchAndAddIndexOfTargetValueToList();
        addTargetCharactersToMapAndCount();
        addTargetCharactersToMapAndCountSolutionTwo();

    }


    private String[] getNames() {return this.names;}
    private String getTarget() {return this.target;}
    private List<Integer> getListOfTargetIndexes() {return this.listOfTargetIndexes;}
    private Map<Character, Integer> getCountCharacters() { return this.countCharacters; }

    private void setNames(String[] names) {this.names = names;}
    private void setTarget(String target) {this.target = target;}

    private void searchAndAddIndexOfTargetValueToList() {
        for ( int index = 0; index < names.length; index++ ) {
            if ( getNames()[index].equals(getTarget()) ) {
                getListOfTargetIndexes().add(index);
            }
        }
    }

    private void addTargetCharactersToMapAndCount() {
        for ( char character : getTarget().toCharArray() ) {
            if ( getCountCharacters().containsKey(character) ) {
                getCountCharacters().put(character, getCountCharacters().get(character) + 1 );
            } else {
                getCountCharacters().put(character, 1);
            }
        }
    }

    private void addTargetCharactersToMapAndCountSolutionTwo() {
       for ( char character : getTarget().toCharArray() ) getCountCharacters().merge(character, 1, Integer::sum);
    }

    public void printListOfTargetIndexes() {
        if ( getListOfTargetIndexes().isEmpty() ) {
            System.out.println("The target value doesn't exist in array.");
        } else {
            System.out.println( getTarget() + ": " + getListOfTargetIndexes());
        }
    }

    public void printNumberOfTargetCharacters() {
        for ( Map.Entry<Character, Integer> entry : getCountCharacters().entrySet() ) {
            System.out.println( entry.getKey() + " - " + entry.getValue() );
        }
    }

    public void printNumberOfTargetCharactersSolutionTwo() {
       getCountCharacters().forEach( ( k, v ) -> System.out.println( k + " - " + v ) );
    }

}
