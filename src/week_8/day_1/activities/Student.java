package week_8.day_1.activities;

public class Student extends GeneralInformation {


    private String className;

    public Student(String firstName, String lastName, String dateOfBirth, int age, String className) {
       super(firstName, lastName,dateOfBirth, age);
       this.className = className;
    }

    public Student(String firstName, String lastName, String dateOfBirth, int age) {
        this(firstName, lastName, dateOfBirth, age, "");
    }

    public void printStudentInfo() {
        super.printGeneralInfo();
        System.out.println("className: " + className );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
