package week_10.day_1.activities;

import java.util.ArrayList;

public class Commanders extends GeneralInformation implements CommandersInterface  {

    static ArrayList<String> listOfStudents = new ArrayList<>();

    public Commanders(String firstName, String lastName, String middleName, int age, String city, String state) {
        super(firstName, lastName, middleName, age, city, state);
        listOfStudents.add( getFirstName() );
    }

    @Override
    public void printGeneralInfo() {
        System.out.println("FirstName: " + getFirstName() );
        System.out.println("LastName: " + getLastName() );
        System.out.println("middleName: " + getMiddleName() );
        System.out.println("Age: " + getAge() );
        System.out.println("City: " + getCity() );
        System.out.println("State: " + getState() );
        printClassInfo();
    }

    @Override
    public void printClassInfo() {
        System.out.println("ClassName: " + className);
        System.out.println("Class Start Time: " + classStartTime);
        System.out.println("Class End Time: " + classEndTime);
    }

    public void printArrayList() {
        System.out.println( listOfStudents );
    }
}
