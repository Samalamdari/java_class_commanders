package week_5.leb_session;

public class WorkingWithArrays {


    public static void main(String[] args) {

        int[] numbers = { 10 , 20 , 30, 40 };
        int[][] twoDimensionalArray = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 }
        };

//        for ( int number : numbers ) {
//            System.out.println( number );
//        }

        for ( int[] number : twoDimensionalArray ) {
            for ( int eachNumberWithinArray : number ) {
                System.out.print( eachNumberWithinArray + "  " );
            }
        }




    }


}
