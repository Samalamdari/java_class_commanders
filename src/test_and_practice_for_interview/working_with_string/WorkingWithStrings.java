package test_and_practice_for_interview.working_with_string;

import javax.sound.midi.Soundbank;
import java.nio.charset.StandardCharsets;

public class WorkingWithStrings {

    public static void main(String[] args) {

        String message = " WellScome to TekSchoolS!!@123@#";

        System.out.println(message.length());
        System.out.println(" ****************   *****************");
        System.out.println(message.replace(" ", ""));
        System.out.println(message.replace('S','s'));
        System.out.println(message.replaceAll("s","S"));
        System.out.println(message.replaceAll("[^A-Z]",""));
        System.out.println(message.replaceAll("[^a-z]",""));
        System.out.println(message.replaceAll("[A-Za-z0-9]","").trim());


    }
}
