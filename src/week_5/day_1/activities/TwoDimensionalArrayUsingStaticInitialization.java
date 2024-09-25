package week_5.day_1.activities;

public class TwoDimensionalArrayUsingStaticInitialization {

    public static void main(String[] args) {

        int[] numbers = { 10, 30, 40 };

        int[][] twoDimensionNumbers = {
                /*        0   1  2     3    4*/
                /* 0 */ { 50, 10 },
                /* 1 */ { 1,  2, 3 },
                /* 2 */ { 1,  20,  6,  90,  10 }
        };

        int[][][] threeDimension = {
                {
                    { 10, 50 },
                    { 5,  40, 30 }
                },
        };


        System.out.println( twoDimensionNumbers[2][3] );
        System.out.println( twoDimensionNumbers[2][4] );
        System.out.println( twoDimensionNumbers[1][1] );


        System.out.println( threeDimension[0][0][0] );
        System.out.println( threeDimension[0][0][1] );
        System.out.println( threeDimension[0][1][0] );
        System.out.println( threeDimension[0][1][2] );

    }

}
