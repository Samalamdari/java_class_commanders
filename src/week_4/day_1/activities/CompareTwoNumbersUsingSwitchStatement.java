package week_4.day_1.activities;

public class CompareTwoNumbersUsingSwitchStatement {

    public static void main(String[] args) {

        // Try to find the bigger number among two numbers using switch statement!

        int numberOne = 1500;
        int numberTwo = 1500;

        int compareResult;
        /*
        * if the first number is bigger than second --> 1
        * if the second number is bigger than first --> -1
        * if both are equal --> 0
        * */

        if ( numberOne > numberTwo ) compareResult = 1;
        else if ( numberOne < numberTwo ) compareResult = -1;
        else compareResult = 0;

        switch ( compareResult ) {
            case 1:
                System.out.println(numberOne + " is bigger than " + numberTwo );
                break;
            case -1:
                System.out.println(numberTwo + " is bigger than " + numberOne );
                break;
            default:
                System.out.println("They are equal");

        }


    }

}
