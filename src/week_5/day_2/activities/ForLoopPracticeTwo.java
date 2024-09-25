package week_5.day_2.activities;

public class ForLoopPracticeTwo {

    /*
    *
    * 1 * 2 = 2
    * 2 * 2 = 4
    * 3 * 2 = 6
    * 4 * 2 = 8
    *
    * */

    public static void main(String[] args) {


        int stop = 10;
        int number = 5;

        for ( int start = 1; start <= stop; start++ ) {
            System.out.println( start + " * " + number + " = " + ( start * number ) );
        }


    }


}
