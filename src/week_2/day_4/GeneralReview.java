package week_2.day_4;

import java.sql.SQLOutput;

public class GeneralReview {

    public static void main(String[] args) {
        boolean [] objs = new boolean[5];
        System.out.println(objs[2]);
        objs[2] = true;
        System.out.println(objs[2]);
        System.out.println("----------------------------------");
        int x = 5; // 5
        int y = 10; // 10
        int z = x + y; // 5 + 10 = 15
        System.out.println("stop 1 = "+x); // 5
        y = z; //
        x = y;
        System.out.println("stop 2 = "+x); // 15
        x =19;
        System.out.println("stop 3 = " + x); // 19
        System.out.println("---------------------------------- second portion of the class");
        testMethod();

        System.out.println("end of the program");

        String str2 = "testing is fun";

        System.out.println("this is the length: "+ str2.length());


        sum(10,5);
        sum(50,8);
    }

public static void sum(int a, int b){
    System.out.println(a+b);
}

    public static void testMethod(){
        System.out.println("line 1 ");
        System.out.println("line 2");
        System.out.println("line 3 ");
        System.out.println("line 4 ");
        System.out.println("line 5 ");
        System.out.println("line 6 ");
        System.out.println("line 7 ");

    }


}
