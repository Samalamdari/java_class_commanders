package test_and_practice_for_interview.practice_hashMap;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashMap {

    public static Map<Integer,String> mapOfStudents = new HashMap<>();

    public static void addStudentToMap() {
        mapOfStudents.put(1,"John");
        mapOfStudents.put(2,"Eric");
        mapOfStudents.put(3,"Tony");
        mapOfStudents.put(4,"Jack");
        mapOfStudents.put(5,"Alexander");
    }

    public static void main(String[] args) {
        addStudentToMap();
        System.out.println(mapOfStudents);
        System.out.println("*****  *****  ****** ****** ******* ********* *********");
        System.out.println(mapOfStudents.entrySet());
        System.out.println("*****  *****  ****** ****** ******* ********* *********");
        mapOfStudents.put(2,"Sam");
        System.out.println(mapOfStudents);

    }
}
