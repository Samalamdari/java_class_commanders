package week_8.day_1.activities;

public class CalculatorClass {

    public static void main(String[] args) {

        System.out.println( sum(10, 20) );
        System.out.println( sum(10, 20, 30) );


    }

    // Create a method which will return the sum of two numbers
    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    // Create a method which will return the sum of three numbers
    public static int sum(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

}
