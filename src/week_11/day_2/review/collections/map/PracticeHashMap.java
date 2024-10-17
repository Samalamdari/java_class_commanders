package week_11.day_2.review.collections.map;

import java.util.HashMap;
import java.util.Map;

public class PracticeHashMap {

    public static Map<Integer, String> mapOfStudents = new HashMap<>();

    public static void addStudentsToMap() {
        mapOfStudents.put(1, "John");
        mapOfStudents.put(2, "Eric");
        mapOfStudents.put(3, "Alexander");
        mapOfStudents.put(4, "Lydia");
        mapOfStudents.put(5, "Erin");
    }

    public static void updateStudent(int id, String newName) {
        mapOfStudents.put(id, newName);
    }

    public static void removeStudent(int id, String studentName) {
        mapOfStudents.remove(id, studentName);
    }

    public static void removeStudent(int id) {
        mapOfStudents.remove(id);
    }

    public static void checkIfMapIsEmpty() {
        if (mapOfStudents.isEmpty()) System.out.println("Yes, map is empty.");
        else System.out.println("No, map is not empty.");
    }

    public static void printKeysInMap() {
        System.out.print("[");
        for (int key : mapOfStudents.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("]");
    }

    public static void printValues() {
        for (String value : mapOfStudents.values()) {
            System.out.print(value + " ");
        }
    }

    public static void printKeysAndValuesOfMap() {
        for (Map.Entry<Integer, String> entry : mapOfStudents.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        addStudentsToMap();
        checkIfMapIsEmpty();

        printKeysInMap();
        printValues();
        printKeysAndValuesOfMap();

    }

}
