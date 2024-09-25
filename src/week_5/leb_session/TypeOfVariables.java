package week_5.leb_session;

public class TypeOfVariables {

    String firstName; // instance variable
    static int salary; // class level variable

    /*
    * 1: Instance variable
    * 2: Class level
    * 3: Local variables
    * */

    // AAA
    /*
     * Arrange
     * Act
     * Assert
     * */


    public static void main(String[] args) {
        /*
         * NameOfClass nameOfYourObject = new NameOfClass();
         * var nameOfYourObject = new NameOfClass();
         * */

        String dateOfBirth = ""; // Local variable

        TypeOfVariables obj = new TypeOfVariables();
        var objTwo = new TypeOfVariables();


        System.out.println( dateOfBirth );

        System.out.println( obj.firstName );

        System.out.println( salary );

        System.out.println( dateOfBirth );

        String character = "A";

        System.out.println( character );

    }


}
