package week_11.lab_session.topics;

public class LogicalOperators {

    public static void main(String[] args) {

        // Logical Operators

        // 1> AND logical operator --> Symbol --> &&

        /*
        * true true ==> true
        * true false ==> false
        * false true ==> false
        * false false ==> false
        * */

        System.out.println( 10 < 20 && 10 < 11 ); // true && true ==> true
        System.out.println( 10 < 20 && 10 < 10 ); // true && false ==> false
        System.out.println( 10 < 20 && 10 < 10 && "tony".equals("john")); // true && false && false ==> false

        // 2> OR logical operator --> Symbol --> ||

        /*
         * true true ==> true
         * true false ==> true
         * false true ==> true
         * false false ==> false
         * */

        System.out.println( 10 < 20 || 10 < 11 ); // true || true ==> true
        System.out.println( 10 < 20 || 10 < 10 ); // true  false ==> true || false ==> true
        System.out.println( 10 < 20 || 10 < 10 || "tony".equals("john")); // true || false || false ==> true

        // 3> XOR logical operator --> Symbol ^

        /*
         * true true ==> false
         * true false ==> true
         * false true ==> true
         * false false ==> false
         * */

        System.out.println( 10 < 20 ^ 10 < 11 ); // true ^ true ==> false
        System.out.println( 10 < 20 ^ 10 < 10 ); // true & false ==> true
        System.out.println( 10 < 20 ^ 10 < 10 ^ "tony".equals("john") ^ 20 == 20 ); // true ^ false ^ false ^ true ==> false

        // 4> NOT logical operator --> Symbol --> !

        /*
        * true ==> false
        * false ==> true
        * */

        System.out.println( !true ); // ==> false
        System.out.println( !false ); // ==> true

        System.out.println( 10 != 20 );
        System.out.println( !("John".equals("tony")) );

        System.out.println( !( 10 < 20 && 25 > 10 || 5 < 0 ^ 55 > 10 ) );

        /*
        * !( true && true || false ^ true )
        * !( true || false ^ true )
        * !( true || true  )
        * !( true || true  )
        * !( true  )
        * false
        * */


    }

}

