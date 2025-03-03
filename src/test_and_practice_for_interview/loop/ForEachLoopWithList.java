package test_and_practice_for_interview.loop;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopWithList {

    public static void main(String[] args) {

        List<String > names = Arrays.asList("Alice", "Bob", "Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
