package week_4.day_3.activities;

public class LogicalOperators {

    /*
    * A
    * B
    * C
    *
    * */
    public static void main(String[] args) {


  /*      if ( ( 10 <= 0 ) && ( "hello".equals("hell0") || true &&  false  ) ) {
            System.out.println("A");
        } else if ( true || true || true && false && false && false || true ) {
            System.out.println("B");
        } else {
            System.out.println("F");
        }
        */


        /*
        *
        *
        *
        *
        *
        * */

        if ( true || false && true || false || true && false ) {
            System.out.println("A");
            if ( true || true && false && false || true || true && false ) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }

            if ( (true || false && true) && ( false || false && true )  ) {
                System.out.println("D");
            } else System.out.println("U");

        } else System.out.println("O");


    }


}
