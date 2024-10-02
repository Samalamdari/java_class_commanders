package week_9.day_2.activities;

public class Runner {

    public static void main(String[] args) {

        Student johnObj = new Student(
                "John",
                "Doe",
                29,
                123
        );

        Student tonyObj = new Student(
                "tony",
                "morphy",
                39,
                456
        );


        System.out.println( johnObj );
        System.out.println( tonyObj );


    }

}
