package week_10.day_2.activities;

import java.io.*;

public class BufferedWriterExampleFour {

    public static void main(String[] args) {

        String[][] studentNames = {
                { "Bob", "Jack" },
                { "Mathias", "James", "Eric" },
                { "Mike", "Killy", "Lydia" }
        };

        String txtFile = "C://Users//TEK//Documents//Commanders//paragraph.txt";
//        String txtFile = "commanders.txt";

        try {
            writeTwoDimensionalArrayContentToFile(studentNames);
            printContentsOfATxtFile(txtFile);

        } catch ( Exception e ) {
            e.printStackTrace();
        }


    }

    public static void writeTwoDimensionalArrayContentToFile(String[][] arr ) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("commanders.txt"));
        for ( int row = 0; row < arr.length; row++ ) {
            for ( int col = 0; col < arr[row].length; col++ ) {
                writer.write( ("[ " + row + " ] [ " + col + " ] ==> " + arr[row][col] ) + '\n' );
            }
            writer.newLine();
        }
        writer.close();
    }

    public static void printContentsOfATxtFile(String address) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(address));
        String line = "";
        while ( (line = reader.readLine() ) != null ) {
            System.out.println(line);
        }
        reader.close();
    }


}

