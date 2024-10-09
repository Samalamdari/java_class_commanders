package week_10.day_2.activities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExampleTwo {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            int desiredNumber = 0;
//            BufferedWriter writer = new BufferedWriter(new FileWriter("multiplicationtableFive.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//TEK//Documents//Commanders//table.txt"));

            System.out.print("Enter the number to print it's multiplication table: ");
            desiredNumber = input.nextInt();

            for (int i = 1; i <= 10; i++) {
//                writer.write('\n');
                writer.write( '\n' + (i + " * " + desiredNumber + " = " + i * desiredNumber) );
                System.out.println( i + " * " + desiredNumber + " = " + (i * desiredNumber) );
            }
            writer.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

}
