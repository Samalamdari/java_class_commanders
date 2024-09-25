package week_5.day_1.activities;

import java.util.Arrays;

public class Test {

    public static void main(String[]   args) {


        String[] names = {"mohammad", "ahmad", "yousuf"};

        System.out.println(Arrays.toString(names));
        System.out.println( names.length );

        System.out.println( names[2] );
        System.out.println( "java is easy!" );

        names[1] = "Anything";

        System.out.println(Arrays.toString(names));

        String name = "Bob";
        name = "Jack";



    }

}
