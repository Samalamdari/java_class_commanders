package test_and_practice_for_interview.interface_practice;

public class Commanders extends GeneralInformation implements CommandersInterface {

    public Commanders(String firstName, String lastName, String middleName, int age, String city, String state) {
        super(firstName, lastName, middleName, age, city, state);
    }

    @Override
    public void printGeneralInfo(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Middle Name: " + getMiddleName());
        System.out.println("Age: " + getAge());
        System.out.println("City: " + getCity());
        System.out.println("State: " + getState());
//        printClassInfo();  ===> here we can get print too,if we do not use print in Runner class. both way are correct.
    }

    @Override
    public void printClassInfo(){
        System.out.println("ClassName: " + className);
        System.out.println("Class Start Time: " + classStartTime);
        System.out.println("Class End Time: " + classEndTime);

    }







}
