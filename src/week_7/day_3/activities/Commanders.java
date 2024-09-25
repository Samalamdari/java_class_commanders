package week_7.day_3.activities;

public class Commanders {

    public String firstName;
    public String lastName;
    public String title;
    public String bootCampName;
    public String timeZone;

    public static int registeredStudents = 0;

    public Commanders() {
        registeredStudents++;
    }

    // public method to print the fields
    public void printStudentInfo() {
        System.out.println("FirstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("Title: " + title);
        System.out.println("BootCamp Name: " + bootCampName);
        System.out.println("Time Zone: " + timeZone);
    }

    public void printRegisteredStudents() {
        System.out.println("Registered Students: " + registeredStudents );
    }

}
