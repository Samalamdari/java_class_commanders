package week_3.lab_session;

public class Casting {

    public static void main(String[] args) {

        /*
         *
         * byte  125 + 320000 ==> int
         * short
         * int
         * long
         * float
         * double
         * boolean
         * char
         *
         *
         * */

        // Declare an integer variable 'intNumber' and initialize it with the value 10
        int intNumber = 10;
        // Print the value of 'intNumber' to the console
        System.out.println(intNumber); // Output: 10

        // Declare a double variable 'doubleNumber' and initialize it with the value 50
        double doubleNumber = 50;
        // Print the value of 'doubleNumber' to the console
        System.out.println(doubleNumber); // Output: 50.0

        // Print the result of adding an integer (10) and a double (67.98)
        // The integer is automatically promoted to double for this operation
        System.out.println(10 + 67.98); // Output: 77.98

        // Display the maximum values for integer and long types
        System.out.println(Integer.MAX_VALUE); // Output: 2147483647 (Maximum value for int)
        System.out.println(Long.MAX_VALUE);    // Output: 9223372036854775807 (Maximum value for long)

        // Declare a long variable 'numberTwo'
        long numberTwo;

        // Attempt to cast a large long value (9223372036854775807L) to an integer
        // This is a potential overflow scenario since the long value exceeds the int range
        int numberOne = (int) (9223372036854775807L);
        // Print the result of the cast
        System.out.println(numberOne); // Output: -1 (due to overflow, the result is incorrect)

        // Declare a double variable 'testDouble' and initialize it with the value 55.1012
        double testDouble = 55.1012;
        // Cast 'testDouble' to an integer and store it in 'testIntNumber'
        int testIntNumber = (int) testDouble;
        // Print the original double value
        System.out.println(testDouble); // Output: 55.1012
        // Print the integer value after casting
        System.out.println(testIntNumber); // Output: 55 (fractional part is discarded)

        // Print a formatted string showing the result of adding the double and integer values
        // The addition is performed, and the result is cast to an integer
        System.out.println("The result of " + testDouble + " + " + testIntNumber + " = " + (int) (testDouble + testIntNumber));
        // Output: The result of 55.1012 + 55 = 110 (casting after addition to integer)
    }

}
