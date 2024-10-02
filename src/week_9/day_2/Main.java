package week_9.day_2;

import java.util.Scanner;
import static week_9.day_3.Student.*;
//import static week_9.day_3.Student.firstName;
//import static week_9.day_3.Student.lastName;
//import static week_9.day_3.Student.salary;
import week_9.day_3.Student;

public class Main {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var obj = new Student();

        input.nextInt();

//        System.out.println( Student.firstName );
//        System.out.println( obj.age );

        System.out.println( firstName );
        System.out.println( lastName );
        System.out.println( salary );

        System.out.println( Student.firstName );

        System.out.println( obj.age );


    }

}
