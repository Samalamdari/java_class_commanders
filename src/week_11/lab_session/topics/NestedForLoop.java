package week_11.lab_session.topics;

public class NestedForLoop {

    public static void main(String[] args) {

        int[][] twoDimensionalArrayOfNumbers = {
                { 10, 50,  60 },
                { 90, 150, 250 }
        };

        String[][] twoNames = {
                { "james", "Eric" },
                { "Killy", "Mike" },
                { "Tony", "Lydia", "John" }
        };

        System.out.println( twoNames[0][0] );

        for ( int row = 0; row < twoNames.length; row++ ) { // OUTER

            for ( int col = 0; col < twoNames[row].length; col++ ) { // INNER
                System.out.print( twoNames[row][col] + " ");
            }
            System.out.println();

        }

        int number = 10;
       int numberTwo = 20;
     do { // OUTER

            System.out.println("Hello!");

          do { // INNER

              System.out.println("Jack!");
               numberTwo--;

            } while ( numberTwo <= 1 );

            number++;

        } while ( number <= 11 );

    }

}
