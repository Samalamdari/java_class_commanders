package week_3.day_3.activites;

public class MixedTypes {

    public static void main(String[] args) {

        // First Rule
        System.out.println( 10 + 5 + 50.90 );

        byte byteNumber = 10;
        short shortNumber = 55;
        int intNumber = 1500;
        double doubleNumber = 25_000;
        float floatNumber = 65_000.5F;
        long longNumber = 1_000_000;
        char character = 'A';
        String firstName = "Bob";

        double result = floatNumber + byteNumber + shortNumber + intNumber + longNumber + doubleNumber + character;
        int resultTwo = (int) (floatNumber + byteNumber + shortNumber + intNumber + longNumber + doubleNumber);

        System.out.println( result );
        System.out.println( resultTwo );




    }

}
