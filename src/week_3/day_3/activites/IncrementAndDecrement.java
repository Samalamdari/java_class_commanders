package week_3.day_3.activites;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int number = 50;
        number++;
        number--;
        number--;
        System.out.println( number );

        /*
        *
        * POST increment
        * POST decrement
        *
        *
        * PRE increment
        * PRE decrement
        *
        * */

        System.out.println( " * * * * * * * *  * * * * * * * *  * * * * * * * *  * * * * * * * *  " );

        int numberTwo = 5;
        numberTwo++;
        System.out.println(numberTwo); // 6, 9
        System.out.println( ++numberTwo ); // 7
        System.out.println( ++numberTwo ); //  8
        System.out.println( --numberTwo ); // 7

    }

}
