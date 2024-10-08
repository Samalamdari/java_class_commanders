package week_10.day_1.activities;

public class Review {

    public static void main(String[] args) {

        int number = 10;
        /* number 10 */
        System.out.println( number );
        System.out.println( number + 10 );

        number = number * 50;

        System.out.println( number );

        String firstName = "Tony"; // --> Heap --> Tony --> 101
        String lastName = "Tony"; // 101

        /* Heap
        * String Pool
        * String literals
        * Reference -> Address */

        /* Stack  */
        /* firstName 101 */
        /* lastName 101*/

        lastName = "tony"; // Heap --> tony --> 102



        /* Stack  */
        /* firstName 101 */
        /* lastName 102*/

        String middleName = "tony";


        /* Stack  */
        /* firstName 101 */
        /* lastName 102
        *  middleName 102
        * */

        System.out.println( 10 == 10 );
        System.out.println( lastName == middleName ); // 102 is equal ? 102 ==> yes ==> true

        System.out.println( lastName.equals(middleName) ); // true

        String lastNameTwo = new String("tony"); // 301 --> 102

        System.out.println( lastName.hashCode() );
        System.out.println( lastNameTwo.hashCode() );

        System.out.println( lastNameTwo == lastName );

        System.out.println( lastNameTwo.equals(lastName) );
        System.out.println( lastNameTwo.equals("tony") );




    }

}
