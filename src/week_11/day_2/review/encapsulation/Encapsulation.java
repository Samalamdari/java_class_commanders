package week_11.day_2.review.encapsulation;

public class Encapsulation {

    // Fields
    private String firstName;
    private String lastName;
    private int age;

    public Encapsulation(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}

    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setAge(int age) {this.age = age;}

    public void printInfo() {
        System.out.println("FirstName: " + getFirstName() );
        System.out.println("LastName: " + getLastName() );
        System.out.println("Age: " + getAge() );
    }
}
