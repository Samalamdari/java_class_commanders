package week_9.day_3.activities;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkingWithString {

    public static void main(String[] args) {

        int number = 10;
        String name = "John";

        System.out.println( name );

        name = "Tony";

        System.out.println( name );

        name = name + " Morphy";

        System.out.println( name );

        int salary = 101;

        System.out.println( salary );

        String sr1 = new String("Eric");
        String sr2 = new String();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] names = {"Tony", "Eric"};

        // How we can print the address of object?
        System.out.println( sr1 );
        System.out.println( sr2 );
        System.out.println( input );
        System.out.println( random );
        System.out.println(Arrays.toString(names) );

        String arrayValue = Arrays.toString(names);

        System.out.println( arrayValue );


    }

}
