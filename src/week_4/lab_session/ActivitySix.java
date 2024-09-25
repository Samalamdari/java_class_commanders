package week_4.lab_session;

import java.util.Arrays;
import java.util.Scanner;

public class ActivitySix {

    /*
Shopping Cart:

Objective: Store the prices of items in a shopping cart and calculate the total cost.

    Question:
    You have an array to store the prices of 10 items in a shopping cart. After storing the prices, how would you calculate
    and print the total cost of all items in the cart?

    NOTE: Use scanner!
    Print the highest item price and the lowest item price as well!

*/

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        double[] itemPrices = new double[10];
        double totalCost = 0;

        System.out.println("Please enter all 10 item prices: ");
        System.out.print("Item 1");
        itemPrices[0] = input.nextDouble();
       // totalCost = totalCost + itemPrices[0];
        totalCost += itemPrices[0];

        System.out.print("Item 2: ");
        itemPrices[1] = input.nextDouble();
        totalCost += itemPrices[1];

        System.out.print("Item 3: ");
        itemPrices[2] = input.nextDouble();
        totalCost += itemPrices[2];

        System.out.print("Item 4: ");
        itemPrices[3] = input.nextDouble();
        totalCost += itemPrices[3];

        System.out.print("Item 5: ");
        itemPrices[4] = input.nextDouble();
        totalCost += itemPrices[4];

        System.out.print("Item 6: ");
        itemPrices[5] = input.nextDouble();
        totalCost += itemPrices[5];

        System.out.print("Item 7: ");
        itemPrices[6] = input.nextDouble();
        totalCost += itemPrices[6];

        System.out.print("Item 8: ");
        itemPrices[7] = input.nextDouble();
        totalCost += itemPrices[7];

        System.out.print("Item 9: ");
        itemPrices[8] = input.nextDouble();
        totalCost += itemPrices[8];

        System.out.print("Item 10: ");
        itemPrices[9] = input.nextDouble();
        totalCost += itemPrices[9];


        // Calculate the total cost
//        totalCost = itemPrices[0] + itemPrices[1] + itemPrices[2] + itemPrices[3] + itemPrices[4] + itemPrices[5] + itemPrices[6] +
//                itemPrices[7] + itemPrices[8] + itemPrices[9];

        System.out.println("Total cost: " + totalCost);

        Arrays.sort(itemPrices);

        System.out.println("Cheapest item: " + itemPrices[0] );
        System.out.println("Highest item: " + itemPrices[9] );



    }

}
