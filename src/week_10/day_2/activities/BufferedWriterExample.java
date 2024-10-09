package week_10.day_2.activities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        String[] names = { "Bob", "James", "Mike", "Tony", "Killy", "Alex" };

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("studentNames.txt"));
            writer.write("Student Names: ");
            for ( String name : names ) {
                writer.write( '\n' + name );
            }
            writer.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

}
