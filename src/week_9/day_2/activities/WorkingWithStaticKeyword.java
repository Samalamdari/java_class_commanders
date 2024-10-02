package week_9.day_2.activities;

public class WorkingWithStaticKeyword {

    static String firstName = "John";
    String lastName = "Doe";

    public static void main(String[] args) {

        WorkingWithStaticKeyword obj = new WorkingWithStaticKeyword();

        System.out.println( firstName );
        System.out.println( WorkingWithStaticKeyword.firstName );

        System.out.println( obj.lastName );

        print();
        WorkingWithStaticKeyword.print();


    }

    public static void print() {
        System.out.println( "Hello Humans!" );
    }

}
