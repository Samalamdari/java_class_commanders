package test_and_practice_for_interview.bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriterExampleTwo {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            int desiredNumber = 0;

            BufferedWriter writer = new BufferedWriter(new FileWriter("multipliticationtable.txt"));

            System.out.print("Enter the number to print it's multiplitication table: ");
            desiredNumber = input.nextInt();


            for (int i = 1; i <=10; i++){

//                writer.write('\n');
                writer.write('\n' + (i + " * " + desiredNumber + " = " +  i * desiredNumber));
                System.out.println(i + " * " + desiredNumber + " = " + ( i * desiredNumber));
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
