package week_10.day_2.activities;

public class Review {

    public static void main(String[] args) {

        try {

            String[] names = {"Bob", "Alex", "James"};

            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);

//            System.out.println( names[3] );

            System.out.println(10 / 0);

        } catch ( ArrayIndexOutOfBoundsException aiobe ) {
            System.out.println("There is no value at specified index, try to check and re-enter the correct index.");
//            aiobe.printStackTrace();
        } catch ( ArithmeticException ae ) {
            System.out.println("Cannot divide a number by zero.");
        }



        System.out.println("Welcome to TekSchool!");

        /*
        *  try {
        *
        *   } catch ( Type of exception nameForException ) {
        *       printStackTrace()
        *       print("Custom message.")
        *  } catch ( Type of exception nameForException  ) {
        *         printStackTrace()
         *       print("Custom message.")
        *   }
        *
        * */

    }

}
