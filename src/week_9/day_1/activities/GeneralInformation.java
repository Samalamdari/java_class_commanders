package week_9.day_1.activities;

public abstract class GeneralInformation {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String title;

    public GeneralInformation(String firstName, String lastName, String phoneNumber, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

//    public void printInfo() {
//        System.out.println("FirstName: " + firstName);
//        System.out.println("LastName: " + lastName);
//        System.out.println("Phone Number: " + phoneNumber);
//        System.out.println("Title: " + title);
//    }

    public abstract void printInfo();

}
