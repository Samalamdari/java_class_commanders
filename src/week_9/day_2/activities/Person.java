package week_9.day_2.activities;

public abstract class Person {

    // Variables
    private final String firstName;
    private final String lastName;
    private final int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Private Methods
//    private void setFirstName(String firstName) {this.firstName = firstName;}
//    private void setLastName(String lastName) {this.lastName = lastName;}
//    private void setAge(int age) {this.age = age;}

    // Public Methods
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}

    // toString Method


    @Override
    public String toString() {
        return "Person { " +
                "firstName = '" + getFirstName() + '\'' +
                ", lastName = '" + getLastName() + '\'' +
                ", age = " + getAge() +
                '}';
    }
}
