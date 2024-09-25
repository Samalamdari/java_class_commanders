package week_8.day_1.activities;

public class GeneralInformation {

    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public int age;

    public GeneralInformation(String firstName, String lastName, String dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public void printGeneralInfo() {
        System.out.println("FirstName: " + firstName );
        System.out.println("lastName: " + lastName );
        System.out.println("DateOfBirth: " + dateOfBirth );
        System.out.println("Age: " + age );
    }
}
