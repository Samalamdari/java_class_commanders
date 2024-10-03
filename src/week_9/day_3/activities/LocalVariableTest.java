package week_9.day_3.activities;

public class LocalVariableTest { // Start of the class Block

    String lastName = "Doe";
    public static int salary = 10_000;

    public static void main(String[] args) { // Main Method Block

        // Arrange
        String firstName = "John"; // Declare
        var obj = new LocalVariableTest();

        System.out.println( obj.lastName );

        System.out.println( salary );

        { // Start of the Block

            int age = 10;
            System.out.println( age );
            System.out.println( age + 10 );

            System.out.println( firstName );

            System.out.println( obj.lastName );

        } // End of the Block

        // Action
        System.out.println( firstName );

        System.out.println( obj.lastName );

        printValueOfSalary();
        obj.printValueOfLastName();

//        System.out.println( age ); // Cannot be accessed, because the lifetime of firstName is already ended
//        System.out.println( age + 10 ); // Cannot be accessed, because the lifetime of firstName is already ended


    } // Close Main Method Block

//    System.out.println( firstName ); // Cannot be accessed, because the lifetime of firstName is already ended

    public static void printValueOfSalary() {
        System.out.println( salary );
    }

    public void printValueOfLastName() {
        System.out.println( lastName );
    }

} // End of the class Block

class MainTest {

    public static void main(String[] args) {

        var obj = new LocalVariableTest();

        System.out.println( LocalVariableTest.salary);
         LocalVariableTest.printValueOfSalary();

    }

}
