package week_6.day_1.activities;

import java.util.Scanner;

public class PrintTable {

   /*
   *
   *    ---------| Name | --------- | LastName | --------- | country ---------
   *    ---------| Bob  | --------- | Morphy | --------- | United States ---------
   *
   *
   * */

    public static void main(String[] args) {

        String[][] userInformation = new String[3][3];
        Scanner input = new Scanner(System.in);

        for ( int i = 0; i < 3; i++ ) {
            System.out.println("user " + ( i + 1 )  );

            System.out.print("Please enter your firstName: ");
            userInformation[i][0] = input.next();

            System.out.print("Please enter your lastName: ");
            userInformation[i][1] = input.next();

            System.out.print("Please enter your country: ");
            userInformation[i][2] = input.next();

        }

        /*
        * % stands for a value
        * - align to the left
        * 10s means 10 characters
        *
        * d-> for digits
        * f-> floats
        *
        * */
        System.out.printf( "%-12s | %-10s | %-12s | %-10s | %-12s | %-10s%n",
                "----------" , "Name" ,  "----------" , "LastName" ,  "----------" , "Country"
                );

        for ( int i = 0; i < userInformation.length; i++ ) {
            System.out.printf( "%-12s | %-10s | %-12s | %-10s | %-12s | %-10s%n",
                    "----------" , userInformation[i][0] ,  "----------" , userInformation[i][1] ,  "----------" , userInformation[i][2]
            );
        }

        /*
        *
        * ----------   | Name       | ----------   | LastName   | ----------   | Country
          ----------   | Bob        | ----------   | bLastname  | ----------   | U.S
          ----------   | Jack       | ----------   | jLastName  | ----------   | Brazil
        *
        * */

    }

}
