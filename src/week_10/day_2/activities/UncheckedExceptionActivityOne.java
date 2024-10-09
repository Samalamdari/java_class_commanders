package week_10.day_2.activities;

public class UncheckedExceptionActivityOne {

    public static void main(String[] args) {

        try {
            String firstName = null;
            System.out.println(firstName.toLowerCase());
        } catch ( NullPointerException e ) {
            System.out.println("The value of String cannot be null, please assign a string value.");
            e.printStackTrace();
        }

    }

}
