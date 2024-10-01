package week_9.day_1.activities;

public class Student extends GeneralInformation {

    public String className;
    public char grade;

    public Student(String firstName, String lastName, String phoneNumber, String title, String className, char grade) {
        super(firstName, lastName, phoneNumber, title);
        this.className = className;
        this.grade = grade;
    }

    @Override
   public void printInfo() {
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Title: " + title);
        System.out.println("Class Name: " + className);
        System.out.println("Grade: " + grade);
   }
}
