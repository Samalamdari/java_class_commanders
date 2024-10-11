package week_10.lab_session;
import java.util.Random;

public class CommandersTeamNamePicker {

    public static void main(String[] args) throws InterruptedException {

        String[] teams = {
                "Student Management System",
                "Library Management System"
        };

        printRandomTeam(teams);

    }

    public static String pickRandomTeam(String[] teams) {
        Random random = new Random();
        String randomTeam = "";
        randomTeam = teams[ ( (teams.length - 1) - 0 ) + 0 ];
        return randomTeam;
    }

    public static void printRandomTeam(String[] teams ) throws InterruptedException {
        System.out.println("Team Name will be reveled in: ");
        for ( int count = 10; count >= 1; count-- ) {
            Thread.sleep(1000);
            System.out.println(count);
        }
        System.out.println( "Lucky team is: " + pickRandomTeam(teams));
    }

}
