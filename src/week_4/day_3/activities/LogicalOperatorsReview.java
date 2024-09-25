package week_4.day_3.activities;


public class LogicalOperatorsReview {

    /*  Truth Table  && AND Logical Operator

    * true --> true ==> true
    * true --> false ==> false
    * false --> true ==> false
    * false --> false ==> false
    *
    * */

    public static void main(String[] args) {

        System.out.println( "Hello".equals("Hello") && ( 50 < 30 )  );

        if ( "Hello".equals("Hello") && ( 50 < 30 ) && ( 10 > 0 ) && ( 0 == 0 )  ) {
            System.out.println("True block executed");
        } else {
            System.out.println("False block executed");
        }

    }
}
