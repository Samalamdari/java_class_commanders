package week_4.lab_session;

import java.util.Arrays;
import java.util.Scanner;

public class ActivitySeven {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        double totalCost = 0;
        int itemsPurchased;

        System.out.print("Enter the total number of items you've purchased: ");
        itemsPurchased = input.nextInt();

        double[] itemPrices = new double[itemsPurchased];

        System.out.println("Please enter all " +  itemsPurchased + " item prices: ");

        for ( int index = 0; index < itemPrices.length; index++ ) {
            System.out.print("Item " + (index + 1) + ": $");
            itemPrices[index] = input.nextDouble();
            totalCost += itemPrices[index];
        }

        // Sort the array
        Arrays.sort(itemPrices);

        System.out.println( " * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  " );

        System.out.println("Total Cost of items purchased: $" + totalCost);
        System.out.println("Lowest item price: $" + itemPrices[0] );
        // n - 1 ==> n --> total length of your target location!
        System.out.println("Highest item price: $" + itemPrices[ itemPrices.length - 1 ] );

        System.out.println( " * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  " );

    }

}
