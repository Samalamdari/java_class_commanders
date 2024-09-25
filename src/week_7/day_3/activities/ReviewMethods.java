package week_7.day_3.activities;

public class ReviewMethods {

    public static void main(String[] args) {

        int result;

        result = sumOfTwoNumbers(10, 20);

        System.out.println( result );

        printSumOfTwoNumbers(10, 20);
        printSumOfTwoNumbers(50, 100);

        sumOfTwoNumbers(10, 20); // 30
        System.out.println( sumOfTwoNumbers(10, 20) );



//        printMessage();
//
//        printMessageWithName("Mike");
//        printMessageWithName("Mitra");
//        printMessageWithName("Bob");
//
//        System.out.println(" * * * * * * * * * Main Menu * * * * * * * * * ");
//        System.out.println("1. Add names to list: ");
//        System.out.println("2. Remove name from list: ");
//        System.out.println("3. Update name from lis: ");
//        System.out.println("4. Print Names: ");
//        System.out.print("Please select one the options: ");

    }

    public static void printMessage() {
        System.out.println("Welcome to commanders class!");
    }

    public static void printMessageWithName( String studentName ) {
        System.out.println("Welcome: " + studentName );
    }

    public static void printSumOfTwoNumbers( int numberOne, int numberTwo ) {
        System.out.println( numberOne + " + " + numberTwo + " = " + ( numberOne + numberTwo )  );
    }

    public static int sumOfTwoNumbers( int numberOne, int numberTwo ) {
        return numberOne + numberTwo;
    }

}
