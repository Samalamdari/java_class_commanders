package week_10.day_2.activities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterExampleThree {

    public static void main(String[] args) {


//            Scanner input = new Scanner(System.in);
//            int RandomNumber = 0;
//            BufferedWriter writter = new BufferedWriter(new FileWriter("example.txt"));

        try {
            System.out.println(10 / 0);
        } catch ( ArithmeticException e ) {
            System.out.println("Cannot divide a number by zero.");
            e.printStackTrace();
        }
}

}
