package test_and_practice_for_interview.object_oriented_programing_oop;

public class GeneralInfo {

    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public int age;

    public GeneralInfo(String firstName, String lastName, String dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public void printGeneralInfo(){
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("DateOfBirth: " + dateOfBirth);
        System.out.println("Age: " + age);
    }
}

