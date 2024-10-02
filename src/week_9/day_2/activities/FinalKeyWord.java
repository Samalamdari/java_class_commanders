package week_9.day_2.activities;

public class FinalKeyWord {

    static final int salary = 10_000; // Class level final variable
    final boolean isTrue = true; // Instance level final variable

    public static void main(String[] args) {

        String firstName;
        final String lastName; // Local final variable

        final String className = "Commanders";
        final double piValue = 3.14;

        lastName = "Doe";

        firstName = "John";

        System.out.println( firstName );

        System.out.println( lastName );

        firstName = "Tony";

//        lastName = "Morphy";

        System.out.println( firstName );

    }

    // I would like to design an application form with firstName, lastname, email, address.... fields.
    // User should be able to enter values, firstName should be maximum 10 characters,
    // lastName, email, address.
    // Every record should have and ID that cannot be changed.

}
