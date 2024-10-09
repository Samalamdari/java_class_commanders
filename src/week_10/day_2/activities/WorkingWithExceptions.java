package week_10.day_2.activities;

public class WorkingWithExceptions {

    public static void main(String[] args) {

        try {

            String[] names = {"Bob", "Alex", "James"};

            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);

            System.out.println( names[2] );

            System.out.println(10 / 2);

        } catch ( ArrayIndexOutOfBoundsException aiobe ) {
            System.out.println("Invalid index.");
            aiobe.printStackTrace();
        } catch ( ArithmeticException ae ) {
            System.out.println("Cannot divide a number by zero.");
            ae.printStackTrace();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        System.out.println("Welcome to TekSchool!");

    }

}


