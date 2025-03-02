package test_and_practice_for_interview;

public class calculator {
    public static void main(String[] args) {

        add(10,20);
        add(45, 65);
        add(5,15,55);
        add(15,35,100,150);
        System.out.println("Welcome".replace('W','K'));
        System.out.println("Hi".replace("Hi","Salam"));

    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void add(byte a, int b) {
    System.out.println(a + b);
    }
    public static void add(short a, short b) {
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void add(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }
}
