package test_and_practice_for_interview.loop;

import java.util.ArrayList;
import java.util.List;

public class ForLoopTwo {
    public static void main(String[] args) {

        // print your names 10 times
//
//        String[] names = {"Bob", "Sam","Mike"};

//        for (String name : names ) {
//                System.out.println(name);
//        }

//        ArrayList<String> namesList = new ArrayList<>();
//
//        namesList.add("John");
//        namesList.add("Bob");
//
//        for (String nameList : namesList) {
//            System.out.println(nameList);
//        }

//
        String[] names = {"Bob", "Sam", "Mike", "Jack", "David"};
        String message = "Hello World";
        int[] numbers = {10, 20, 30, 40, 50, 60, 1, 3, 5, 7, 9};
        int sumOfValue = 0;

//        for (int i = 0; i < message.length(); i++){
//            System.out.println(message.charAt(i));
//        }
//        for (int number : numbers) {
//            sumOfValue = sumOfValue + number;
//            System.out.println(number);
//        }
//        System.out.println("Sum of value is: " + sumOfValue);

        // print even numbers
//        for (int number : numbers) {
//            if(number % 2 == 0) {
//                System.out.println(number);
//            }
//        }
        // print odd numbers
//        for (int number : numbers) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//        }

        // print name with equals
//        for (String name : names) {
//            if (name.equals("Sam")) {
//                System.out.println(name);
//                break;
//            }
//        }

        // print all numbers in array list except 2 numbers

        for (int number : numbers) {
            if (number == 10 || number == 20) {
                continue;
            } else {
                System.out.println(number);
            }
        }
    }
}
