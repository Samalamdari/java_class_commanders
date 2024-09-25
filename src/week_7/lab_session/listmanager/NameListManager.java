package week_7.lab_session.listmanager;

import java.util.ArrayList;

public class NameListManager {

    // Attribute
    private ArrayList<String> listOfNames;

    // Constructor
    public NameListManager() {
        listOfNames = new ArrayList<>();
    }

    // Add elements to list
    public void addNameToList(String name) {
        listOfNames.add(name);
        System.out.println("Name is added to list.");
    }

    // Update elements from list
    public void updateNameFromList(int index, String newValue) {
        if ( index >= 0 && index < listOfNames.size() ) {
            listOfNames.set(index, newValue);
            System.out.println("Name updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Remove elements from list
    public void removeNameFromList(int index) {
        if ( index >=0 && index < listOfNames.size() ) {
            System.out.println(  listOfNames.get(index) + " has been removed from list.");
            listOfNames.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Print elements from list
    public void printListElements() {
        if ( listOfNames.isEmpty() ) {
            System.out.println("List is empty, make sure to add some values first.");
        } else {
            for ( int index = 0; index < listOfNames.size(); index++ ) {
                System.out.println(index + ": " + listOfNames.get(index));
            }
        }
    }

}
