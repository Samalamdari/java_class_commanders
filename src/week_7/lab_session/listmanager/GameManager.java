package week_7.lab_session.listmanager;

import java.util.Scanner;

public class GameManager {

    // Attributes
    private NameListManager nameListManager;
    private Scanner scanner;

    // Constructor
    public GameManager() {
        nameListManager = new NameListManager();
        scanner = new Scanner(System.in);
    }

    private void printMenu() {
        System.out.println(" * * * * * * * * * Main Menu * * * * * * * * * ");
        System.out.println("1. Add names to list: ");
        System.out.println("2. Remove name from list: ");
        System.out.println("3. Update name from list: ");
        System.out.println("4. Print Names: ");
        System.out.println("5. Exit");
        System.out.print("Please select one the options: ");
    }

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Please enter a name:");
                String name = scanner.next();
                nameListManager.addNameToList(name);
                break;
            case 2:
                nameListManager.printListElements();
                System.out.print("Please select an index of an item to be removed from list: ");
                int indexOfItemToBeRemoved = scanner.nextInt();
                nameListManager.removeNameFromList(indexOfItemToBeRemoved);
                break;
            case 3:
                nameListManager.printListElements();
                System.out.print("Please select an index of an item to be update from list: ");
                int indexOfItemToBeUpdated = scanner.nextInt();
                System.out.print("Please enter a new name: ");
                String newName = scanner.next();
                nameListManager.updateNameFromList(indexOfItemToBeUpdated, newName);
                break;
            case 4:
                nameListManager.printListElements();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid menu item, please select the correct menu option.");
        }
    }

    public void startGame() {
        int choice = 0;
        do {
            printMenu();
            choice = scanner.nextInt();
            handleUserChoice(choice);
        } while ( choice != 5 );
    }

}
