package week_10.day_2.activities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader( new FileReader("multiplicationtableThree.txt") );
            String line = "";
            while ( (line = reader.readLine() ) != null ) {
                System.out.println( line );
            }

        } catch ( FileNotFoundException e ) {
            System.out.println("Cannot locate the file, please check the address.");
        } catch ( IOException ie ) {
            ie.printStackTrace();
        }

    }

}
