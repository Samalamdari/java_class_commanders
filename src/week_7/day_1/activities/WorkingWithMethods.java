package week_7.day_1.activities;

public class WorkingWithMethods {

    public static void main(String[] args) {

        printCommandersMessage();
        printWelcomeMessage();

        printWelcomeMessageWithName("Bob");
        printWelcomeMessageWithName("Jack");
        printWelcomeMessageWithName("James");

        printResultOfTwoNumbers(10, 20);
        printResultOfTwoNumbers(40, 50);
        printResultOfTwoNumbers(150, 1960);

        ;
        System.out.println( addThreeNumbers(10, 15, 25) );
        int sumOfThreeNumbers = addThreeNumbers(10, 15, 25);

        System.out.println( sumOfThreeNumbers );
        System.out.println( sumOfThreeNumbers + 100 );

        System.out.println( "Welcome".toLowerCase() );
    }

    // Create a method to print this message --> "Welcome to TekSchool"
    /*
    * Access Modifier static Return Type NameOfMethod() {
    * }
    * */

    public static void printWelcomeMessage() {
        System.out.println("Welcome to TekSchool!");
    }

    public static void printCommandersMessage() {
        System.out.println("Commanders Class!");
    }

    public static void printWelcomeMessageWithName( String name ) {
        System.out.println("Welcome " + name );
    }

    public static void printResultOfTwoNumbers(int numberOne, int numberTwo) {
        System.out.println( "The result of " + numberOne + " + " + numberTwo + " = " + ( numberOne + numberTwo ) );
    }

    public static int addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

}
