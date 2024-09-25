package week_8.day_1.activities;

public class Employee extends GeneralInformation {

    String companyName;

    public Employee(String firstName, String lastName, String dateOfBirth, int age, String companyName) {
        super(firstName, lastName, dateOfBirth, age);
        this.companyName = companyName;
    }


    public void printEmployeeInfo() {
        super.printGeneralInfo();
        System.out.println("CompanyName: " + companyName );
    }

}
