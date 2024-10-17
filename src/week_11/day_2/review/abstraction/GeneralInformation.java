package week_11.day_2.review.abstraction;

public abstract class GeneralInformation {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // Constructor
    public GeneralInformation(String firstName, String lastName, int age, String address) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setAddress(address);
    }


    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public int getAge() { return age;}
    public String getAddress() { return address;}

    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setAge(int age) {this.age = age;}
    private void setAddress(String address) {this.address = address;}

    public abstract void print();

}
