package week_7.day_2.activities;

public class EmployeeInfo {

    public int id;
    public String fullName;
    public String dateOfBirth;

    public EmployeeInfo(int id, String fullName, String dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public void printEmployeeInfo() {
        System.out.println("Id: " + id);
        System.out.println("FullName: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

}
