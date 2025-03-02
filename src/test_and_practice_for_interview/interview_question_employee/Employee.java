package test_and_practice_for_interview.interview_question_employee;

public class Employee {

    // Variables
        private String firstName;
        private String lastName;
        private String title;
        private String address;
        private int age;

        //Constructor
    public Employee(String firstName, String lastName, String title, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.age = age;
    }
    //Getter
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getTitle() {return this.title;}
    public String getAddress() {return this.address;}
    public int getAge() {return this.age;}
    //Setter
    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setTitle(String title) {this.title = title;}
    private void setAddress(String address) {this.address = address;}
    private void setAge(int age) {this.age = age;}
    // toString ==> for print    first and best way
    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
    // second way
    public void printEmployeeInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Title: " + title);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
