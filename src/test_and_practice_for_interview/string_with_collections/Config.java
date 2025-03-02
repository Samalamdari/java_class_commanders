package test_and_practice_for_interview.string_with_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Config {

    // use Encapsulation
    private String[] names;
    private String target;
    private final List<Integer> listOfTargetIndexes;
    private final Map<Character,Integer> countCharacters;

    // Constructor
    public Config(String[] names, String target) {
        setNames(names);
        setTarget(target);
        listOfTargetIndexes = new ArrayList<>();
        countCharacters = new HashMap<>();
        searchAndAddIndexOfTargetValueToList();
        addTargetCharactersToMapAndCount();
    }
    // Getter
    private String[] getNames() {return this.names;}
    private String getTarget() {return this.target;}
    private List<Integer> getListOfTargetIndexes() {return this.listOfTargetIndexes;}
    private Map<Character,Integer> getCountCharacters() {return this.countCharacters;}

    // Setter
    private void setNames(String[] names) {this.names = names;}
    private void setTarget(String target) {this.target = target;}

    // method
    private void searchAndAddIndexOfTargetValueToList() {
        for (int index = 0; index < names.length; index++){
            if (getNames()[index].equals(getTarget())) {
                getListOfTargetIndexes().add(index);
            }
        }
    }

    private void addTargetCharactersToMapAndCount() {
        for (char character : getTarget().toCharArray()) {
        // if the character is in the map,add the character and then get the value or the count and add 1 to it.
            if (getCountCharacters().containsKey(character)) {
                getCountCharacters().put(character, getCountCharacters().get(character) + 1);
            }else
        // if not,add the character for the first time and give it a count of 1s.
             getCountCharacters().put(character,1);
        }
    }

    public void printListOfTargetIndexes() {
        if (getListOfTargetIndexes().isEmpty()) {
            System.out.println("The target value doesn't exist in array.");
        }else{
            System.out.println(getTarget() + ": " + getListOfTargetIndexes());
        }
    }
    public void printNumberOfTargetCharacters() {
        for (Map.Entry<Character,Integer> entry : getCountCharacters().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }






}
