package week_11.lab_session.topics;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName;
        int age;

        System.out.print("Please enter your firstName: ");
        firstName = input.next();

        System.out.print("How old are you: ");
        age = input.nextInt();

        System.out.println("FirstName:" + firstName );
        System.out.println("Age:" + age );

    }

}
