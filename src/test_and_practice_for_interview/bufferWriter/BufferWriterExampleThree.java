package test_and_practice_for_interview.bufferWriter;

import java.io.*;


public class BufferWriterExampleThree {

     public static void main(String[] args) {

        String[][] studentNames = {
                {"Bob", "Jack"},
                {"Mathias", "James", "Eric"},
                {"Mike", "Killy", "Lydia"}
        };
        String txtFile = "commanders.txt";
//        String txtFile = "C://Users//elink//OneDrive//Documents//paragraph.txt";

        writeTwoDimensionalArrayContentToFile(studentNames);
        printContentsOfATxtFile(txtFile);

     }


      public static void writeTwoDimensionalArrayContentToFile(String[][] arr){
            try {

                BufferedWriter writer = new BufferedWriter(new FileWriter("commanders.txt"));

                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row].length; col++) {
//                        System.out.println("[ " + row + " ] [ " + col + " ] ==> " + arr[row][col]); // only for print bufferreader
                        writer.write(("[ " + row + " ] [ " + col + " ] ==> " + arr[row][col]) +'\n');
                    }
//                    System.out.println();  // only for print bufferreader
                    writer.newLine();
                }
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

      }

      public static void printContentsOfATxtFile(String address) {

         try {
             BufferedReader reader = new BufferedReader(new FileReader(address));
             String line = "";
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
             reader.close();
         } catch (Exception io){
             io.printStackTrace();
         }
      }

 }



