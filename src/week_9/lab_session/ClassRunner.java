package week_9.lab_session;

public class ClassRunner {

    public static void main(String[] args) {

        ClassA obj = new ClassA(
                "John",
                28,
                15_000
        );

        ClassA objTwo = new ClassA(
                "John",
                28,
                15_000,
                false
        );


        System.out.println( obj );
        System.out.println( objTwo );

    }

}
