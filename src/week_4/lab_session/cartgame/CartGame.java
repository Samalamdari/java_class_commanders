package week_4.lab_session.cartgame;
import java.util.Arrays;
import java.util.Scanner;

public class CartGame {

    // Variables
    private Scanner input;
    private double totalCost;
    private int itemsPurchased;
    private double[] itemPrices;

    // Constructor
    public CartGame() {
        setInput(new Scanner(System.in));
        setTotalCost(0);
        setItemsPurchased(callUserForNumberOfItems());
        setItemPrices( new double[getItemsPurchased()] );
    }

    // Getters & Setters
    private Scanner getInput() {return input;}
    private void setInput(Scanner input) {this.input = input;}
    private double getTotalCost() {return totalCost;}
    private void setTotalCost(double totalCost) {this.totalCost = totalCost;}
    private int getItemsPurchased() {return itemsPurchased;}
    private void setItemsPurchased(int itemsPurchased) {this.itemsPurchased = itemsPurchased;}
    private double[] getItemPrices() {return itemPrices;}
    private void setItemPrices(double[] itemPrices) {this.itemPrices = itemPrices;}

    // Public Method to ask the user for the total items
    private int callUserForNumberOfItems() {
        System.out.print("Enter the total number of items you've purchased: ");
        setItemsPurchased(input.nextInt());
        return getItemsPurchased();
    }

    // Method to ask the user for the item prices
    private void askUserForItemPrices() {
        for ( int index = 0; index < getItemPrices().length; index++ ) {
            System.out.print("Item " + (index + 1) + ": $");
            getItemPrices()[index] = input.nextDouble();
            setTotalCost( getTotalCost() + getItemPrices()[index] );
        }
    }

    // Method to print the final message for the user
    private void printResult() {
        Arrays.sort(getItemPrices());
        System.out.println("Total Cost of items purchased: $" + getTotalCost());
        System.out.println("Lowest item price: $" + getItemPrices()[0] );
        System.out.println("Highest item price: $" + getItemPrices()[ getItemPrices().length - 1 ] );
    }

    // Method to start the game
    public void startGame() {
        askUserForItemPrices();
        Arrays.sort(getItemPrices());
        printResult();
    }

}
