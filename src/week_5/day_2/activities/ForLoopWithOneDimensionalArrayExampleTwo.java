package week_5.day_2.activities;

import java.util.Random;

public class ForLoopWithOneDimensionalArrayExampleTwo {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[20];
        int randomNumber;

        for ( int index = 0; index < numbers.length; index++  ) {
            randomNumber = random.nextInt( ( 10 - 5 ) + 5 );
            numbers[index] = randomNumber;
            System.out.print( numbers[index] + " ");
        }

    }

}
