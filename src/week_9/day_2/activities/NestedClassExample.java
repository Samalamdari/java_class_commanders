package week_9.day_2.activities;


public class NestedClassExample { // OUTER CLASS

    static String firstName = "John";
    static final int maxSpeed = 120;

    static class TestNested { // INNER CLASS

        static int salary = 10_000;

        public static void printMaxSpeed() {
            System.out.println("Max speed is: " + maxSpeed );
        }

        public static void printFirstName() {
            System.out.println("FirstName: " + firstName );
        }

    }

}


