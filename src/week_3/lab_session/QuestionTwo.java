package week_3.lab_session;

public class QuestionTwo {

    public static void main(String[] args) {

        /*
         *
         *   5. Variable Swapping:
         *   You have two variables a = 5 and b = 10. Without using any other variables, swap the values of a and b so
         *   that a has value 10 and b has value 5.
         * */

        // Declare three integer variables a, b, and c
        int a, b, c;

        // Initialize variable 'a' with the value 1500
        // Initialize variable 'b' with the value 5500000
        a = 1500;
        b = 5500000;

        // Print the values of 'a' and 'b' before swapping
        System.out.println("Value of a before swap: " + a); // Output: Value of a before swap: 1500
        System.out.println("Value of b before swap: " + b); // Output: Value of b before swap: 5500000

        // Swap values using a temporary variable 'c'
        c = a;  // Store the value of 'a' in 'c'
        a = b;  // Assign the value of 'b' to 'a'
        b = c;  // Assign the value stored in 'c' (original 'a') to 'b'

        // Print the values of 'a' and 'b' after the first swap
        System.out.println("Value of a after swap: " + a); // Output: Value of a after swap: 5500000
        System.out.println("Value of b after swap: " + b); // Output: Value of b after swap: 1500

        // Swap the values using arithmetic operations
        a = a + b;  // Add 'b' to 'a' and store the result in 'a'
        b = a - b;  // Subtract the new 'b' (original 'a') from 'a' to get the original 'a'
        a = a - b;  // Subtract the new 'b' (original 'a') from 'a' to get the original 'b'

        // Print the values of 'a' and 'b' after the second swap
        System.out.println("Value of a after swap: " + a); // Output: Value of a after swap: 1500
        System.out.println("Value of b after swap: " + b); // Output: Value of b after swap: 5500000

    }

}
