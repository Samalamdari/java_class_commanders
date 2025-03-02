package test_and_practice_for_interview.bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterExample {
    public static void main(String[] args) {

        String[] names = {"Bob","John","Mike","David","Killy","David"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("studentNames.txt"));

            writer.write("Student Name: ");
            for (String name : names){
                writer.write('\n' + name);
            }
                writer.close();

        }catch (Exception e){
            System.out.println(" Check the error");
            e.printStackTrace();
        }

    }
}
