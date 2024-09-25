package week_4.day_2.activities;

public class AndLogicalOperatorActivity {

    /*
    * Declare four variables of type int
    * assign some values to them
    * calculate the result of each two separately
    * compare the result of these two together
    * return true if equal
    * return false if not
    * */

    public static void main(String[] args) {

        int numberOne = 50, numberTwo = 100, numberThree = 150, numberFour = 200, firstResult, secondResult;

        // Calculate the result of first two
        firstResult = numberOne + numberTwo;

        // Calculate the result of the second two
        secondResult = numberThree + numberFour;

        // Compare the results, print true if equal, print false if not
        if ( (firstResult == secondResult) && ( secondResult == firstResult )  ) System.out.println("true");
        else System.out.println("false");

        // Using conditional operator
        System.out.println( ( firstResult == secondResult ) ? true : false );

    }

}
