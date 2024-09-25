package week_4.day_3.activities;

public class WorkingWithArray {

    public static void main(String[] args) {

        int number = 20;
        double doubleNumber = 50.5;
        char character = 'A';
        String name = "Bob";


        // Create an array of size three
        int[] numbers = new int[3];
        String[] names = new String[3];

        // Store values based on the indexes in that location
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // numbers[3] = 50;

        names[0] = "Bob";
        names[1] = "Tony";
        names[2] = "Jack";

        // Print the elements at each location
        System.out.println( numbers[0] );
        System.out.println( numbers[1] );
        System.out.println( numbers[2] );

        System.out.println( names[0] );
        System.out.println( names[1] );
        System.out.println( names[2] );




    }

}
