package test_and_practice_for_interview.string_with_collections;

import java.util.ArrayList;
import java.util.List;

 public class AppTwoForanotherWaySolution {

    public static void main(String[] args) {

         //way 2 to solve test directly
        String[] names = {"Bob","Jack","Bob","Tony","Alex","James","James"};
        String target = "Sam";
        List<Integer> listOfTargetIndexes = new ArrayList<>();

        for (int index = 0; index < names.length; index++){
            if (names[index].equals(target)) {
                listOfTargetIndexes.add(index);
            }
        }
        if (listOfTargetIndexes.isEmpty()) {
            System.out.println("The target value doesn't exist in array.");
        }else{
            System.out.println(target + ": " + listOfTargetIndexes);
        }

    }
 }

