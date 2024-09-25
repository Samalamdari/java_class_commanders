package week_3.day_3.activites;


import java.util.Scanner;

public class CreateMenuGame {

    public static void main(String[] args) {

        /*
        *  * * * * * * MENU * * * * *
        * 1. Enter FirstName
        * 2. Enter LastName
        * 3. Exit
        * Please select an option: X
        * */


        Scanner input = new Scanner(System.in);
        int option;
        String firstName = "";
        String lastName = "";

        System.out.println(" * * * * * * MENU * * * * * ");
        System.out.println("1. Enter FirstName");
        System.out.println("2. Enter LastName");
        System.out.println("3. Exit");
        System.out.print("Please select an option: ");
        option = input.nextInt();

        if ( option == 1 ) {
            System.out.print("Please enter your firstName: ");
            firstName = input.next();
            System.out.println("FirstName: " + firstName);
        }

        if ( option == 2 ) {
            System.out.print("Please enter your lastName: ");
            lastName = input.next();
            System.out.println("lastName: " + lastName);
        }

        if ( option == 3 ) {
            input.close();
            System.out.println("Good Byee!!!!!!!!!!!!!!!!!");
        }


    }

}
