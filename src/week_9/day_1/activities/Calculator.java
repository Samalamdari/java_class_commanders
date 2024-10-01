package week_9.day_1.activities;

public class Calculator {

    public static void main(String[] args) {

        add(10, 20);
        add(10, 20, 50);
        add(10, 20, 50.5);
        add(10, 20, 100.5);
        add(10, 20);
        add(10, 20);

    }

    public static void add(byte a, byte b) {
        System.out.println( a + b );
    }

    public static void add(short a, short b) {
        System.out.println( a + b );
    }

    public static void add(int a, int b) {
        System.out.println( a + b );
    }


    public static void add(long a, long b) {
        System.out.println( a + b );
    }


    public static void add(int a, int b, int c) {
        System.out.println( a + b + c );
    }

    public static void add(int a, int b, double c) {
        System.out.println( a + b + c );
    }

    public static void add(byte a, int b, int c) {
        System.out.println( a + b + c );
    }

    public static void add(int a, int b, int c, int d) {
        System.out.println( a + b + c + d );
    }


}
