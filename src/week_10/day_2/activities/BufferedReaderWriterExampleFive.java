package week_10.day_2.activities;

import java.io.*;

public class BufferedReaderWriterExampleFive {

    public static void main(String[] args) {

        String fileAddress = "C://Users//TEK//Documents//Commanders//numbers.txt";

        try {
            readerAndWriteResult(fileAddress);
        } catch ( Exception e ) {
            e.printStackTrace();
        }

    }

    public static void readerAndWriteResult(String fileAddress ) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileAddress));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fileAddress));

        // Read the information
        String line = reader.readLine();

        System.out.println( line );

//        // Convert the string to int and calculate the result
//        int number = Integer.parseInt( line.trim() );
//        int result = number * 2;

//        reader.close();

        // Store the result back to the file in new line
//        writer.newLine();
//        writer.write( number + " * 2 = " + result );
//
//
//        writer.close();

    }

}
