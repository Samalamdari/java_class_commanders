package week_9.day_3.activities;

public class LocalVariables {

    public static void main(String[] args) {

        String firstName = "John";

        if ( firstName.equals("John") ) {

            String middleName = "M";
            System.out.println( middleName );
            System.out.println( firstName );

        }

        {
            String lastName = "lastName";
        }

         System.out.println( firstName );
//         System.out.println( middleName );
        // System.out.println( lastName );
    }

}
