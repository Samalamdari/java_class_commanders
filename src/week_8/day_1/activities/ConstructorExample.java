package week_8.day_1.activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ConstructorExample {

    int number;
   String firstName;

    public ConstructorExample() {
        number = 0;
        firstName = "";
    }

   public static void printMessage() {
       System.out.println("Hello Humans!");
   }


}

class Test {

    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> listOfNames = new ArrayList<>();

        System.out.println( obj.number );
        System.out.println( obj.firstName );

    }

}
