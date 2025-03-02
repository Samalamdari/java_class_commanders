package test_and_practice_for_interview.bufferWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("multipliticationtable.txt"));

            String line = "";
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }

        }catch (FileNotFoundException e){
            System.out.println("Can not locate the file, please check the address.");
        }catch (IOException ie){
            ie.printStackTrace();
        }




    }
}
