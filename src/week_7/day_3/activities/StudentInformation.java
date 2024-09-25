package week_7.day_3.activities;

public class StudentInformation {

    String schoolYear;
    char grade;
    String firstName;
    String middleName;
    String lastName;
    String dateOfBirth;
    String address;

    public void printStudentInfo() {
        System.out.println("School Year: " + schoolYear);
        System.out.println("Grade: " + grade);
        System.out.println("FirstName: " + firstName);
        System.out.println("MiddleName: " + middleName);
        System.out.println("LastName: " + lastName);
        System.out.println("DateOfBirth: " + dateOfBirth);
        System.out.println("Address: " + address);
    }

}
