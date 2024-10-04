package week_9.lab_session;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudent {

    public static void main(String[] args) throws InterruptedException {

        String[] names = { "Aseel", "Mitra", "Salma", "Shogufta" };
        printRandomStudent(names);

    }

    public static void printRandomStudent( String[] names ) throws InterruptedException {
        Random random = new Random();
        List<String> listOfStudents = new ArrayList<>();
        int randomIndex = 0;

        for ( String name : names ) listOfStudents.add(name);

        // max - min + min
        randomIndex = random.nextInt( ( (listOfStudents.size() - 1) - 0 ) + 0 );

        System.out.println("Announcing the name in:");
        for ( int i = 3; i >=1; i-- ) {
            Thread.sleep(1000);
            System.out.println( i );
        }
        System.out.println("You need to move into the second group: " + listOfStudents.get( randomIndex ) );

    }

}
