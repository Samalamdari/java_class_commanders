package week_4.lab_session;

import java.util.Arrays;

public class ActivityFour {

    /*
   Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.
*/

    public static void main(String[] args) {

        String[] sportTeams = new String[5];
        int[] numbers = new int[10];

        sportTeams[0] = "A";
        sportTeams[1] = "B";
        sportTeams[2] = "C";
        sportTeams[3] = "D";
        sportTeams[4] = "E";

        // store numbers in array
        numbers[0] = 10;
        numbers[1] = 110;
        numbers[2] = 8;
        numbers[3] = 89;
        numbers[4] = 3;
        numbers[5] = 2;
        numbers[6] = 1;
        numbers[7] = 63;
        numbers[8] = 15;
        numbers[9] = 0;

        // System.out.println( "Top team: " + sportTeams[0] + sportTeams[1] );
       // System.out.println( "First team: " + sportTeams[0] + " Second team: " + sportTeams[1] );
        System.out.println( "First team: " + sportTeams[0] + "\nSecond team: " + sportTeams[1] );

        // Print the first and the second team name side by side --> AB
        // Print the second team as well within the same System.out.println();

       // System.out.println( sportTeams );
        System.out.println( Arrays.toString(sportTeams) );
        Arrays.sort(numbers);
        System.out.println( Arrays.toString(numbers));



    }

}
