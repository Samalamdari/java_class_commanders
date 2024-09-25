package week_5.leb_session;

public class WorkingWithTwoDimensionalArray {

    public static void main(String[] args) {

        int[] numbers = { 10, 30, 30 };
        int[][] twoDimensionalNumber = {
                { 50, 30 },
                { 10 },
                { 50, 90 },
                {  100, 250, 290  },
        };

        System.out.println( twoDimensionalNumber[2][1] );
        System.out.println( twoDimensionalNumber[3][2] );

    }

}
