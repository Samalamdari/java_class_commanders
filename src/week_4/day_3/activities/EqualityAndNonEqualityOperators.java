package week_4.day_3.activities;

public class EqualityAndNonEqualityOperators {

    /*
    *
    * equality --> ==
    * non-equality --> !=
    *
    *  NOTE:
    * assignment -->  =
    *
    * */

    public static void main(String[] args) {

        int numberOne = 50;
        int numberTwo = 50;

        System.out.println( numberOne == numberTwo );
        //                      50    ==   50 = yes --> 1 --> true

        System.out.println( numberOne != numberTwo );
        //                      50    !=      50 --> no --> 0 --> false

        System.out.println( 100 != 50 ); // --> true


        if ( ( true || false && true || false || true && false ) ^ ( false ^ true ) ) {
            System.out.println("A");
            if ( true || true && false && false || true || true && false ) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }

            if ( (true || false && true) && ( false || false && true ) ^ ( true )  ) {
                System.out.println("D");
            } else System.out.println("U");

        } else System.out.println("O");

    }


}
