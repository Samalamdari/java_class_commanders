package week_2.day_1.activities;

public class WorkingWithMethods {

    public static void main(String[] args) {
        System.out.println( addTwoNumbers(10, 20) );
        printMessage();
    }

    public static int addTwoNumbers( int a, int b ) {
        return a + b;
    }

    public static void printMessage() {
        System.out.println("Hello Commanders!");
    }

}
