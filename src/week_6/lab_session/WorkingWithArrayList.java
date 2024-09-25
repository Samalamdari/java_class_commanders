package week_6.lab_session;

import java.util.*;

public class WorkingWithArrayList {

    /*
    *  * * * * * * * * * * Main Menu * * * * * * * * * *
    *  1: Enter Items Price
    *  2: Display Total
    *  3: Display Min
    *  4: Display Max
    *  5: Display Avg
    *  6: Exit
    *  Your choice:
     * */

    /*
    * If user selects 1,
    * You should keep asking the user for Items
    * For instance
    * Item 1 Price: X
    * Do you want add another Item (yes / no): if yes, repeat the same process
    * // if no, return back to main menu.
    * */

    public static void main(String[] args) {

        int choice = 0;
        double itemsTotalPrice = 0;
        double minimumItemPrice, maximumItemPrice, averageItemPrice = 0;
        var input = new Scanner(System.in);
        List<Double> listOfItemPrices = new ArrayList<>();

        do {

            System.out.println("* * * * * * * * * * Main Menu * * * * * * * * * *");
            System.out.println("1: Enter Items Price");
            System.out.println("2: Display Total");
            System.out.println("3: Display Min");
            System.out.println("4: Display Max");
            System.out.println("5: Display Avg");
            System.out.println("6: Exit");
            System.out.print("Your choice: ");
            choice = input.nextInt();

            switch ( choice ) {
                case 1:
                    boolean addMore = true;
                    while ( addMore ) {
                        System.out.print("Item Price: ");
                        double itemPrice = input.nextDouble();
                        listOfItemPrices.add(itemPrice);
                        System.out.print("Do you want add another Item (yes / no): ");
                        String userInput = input.next();
//                        if (userInput.equals("yes")) {
//                            addMore = true;
//                        } else {
//                            addMore = false;
//                        }
                        addMore = userInput.equalsIgnoreCase("yes");
                    }
                    break;

                case 2:
                    if ( listOfItemPrices.isEmpty() ) System.out.println("List is empty, please add some items first.");
                    else for (double price : listOfItemPrices) itemsTotalPrice += price;
                    System.out.println( ( itemsTotalPrice == 0.0 ) ? "" : "Total: $" + itemsTotalPrice );
                    break;

                case 3:
                    if ( listOfItemPrices.isEmpty() ) System.out.println("List is empty, please add some items first.");
                    else {
                        minimumItemPrice = Collections.min(listOfItemPrices);
                        System.out.println("Minimum Item Price: $" + minimumItemPrice);
                    }
                   break;

                case 4:
                    if ( listOfItemPrices.isEmpty() ) System.out.println("List is empty, please add some items first.");
                    else {
                        maximumItemPrice = Collections.max(listOfItemPrices);
                        System.out.println("Maximum Item Price: $" + maximumItemPrice);
                    }
                    break;

                case 5:
                    if ( listOfItemPrices.isEmpty() ) System.out.println("List is empty, please add some items first.");
                    else {
                        for ( double price : listOfItemPrices ) itemsTotalPrice += price;
                        averageItemPrice = itemsTotalPrice / listOfItemPrices.size();
                        System.out.println("Average Item Price: $" + averageItemPrice);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.....");
                    break;

                default:
                    System.out.println("Invalid choice, please enter the correct choice");
            }

        } while ( choice != 6 );

    }

}
