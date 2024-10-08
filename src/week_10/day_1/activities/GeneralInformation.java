package week_10.day_1.activities;

public abstract class GeneralInformation {

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String city;
    private String state;

    public GeneralInformation(String firstName, String lastName, String middleName, int age, String city, String state) {
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setAge(age);
        setCity(city);
        setState(state);
    }

    private void setFirstName(String firstName) {this.firstName = firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setMiddleName(String middleName) {this.middleName = middleName;}
    private void setAge(int age) {this.age = age;}
    private void setCity(String city) {this.city = city;}
    private void setState(String state) {this.state = state;}

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getMiddleName() {return middleName;}
    public int getAge() {return age;}
    public String getCity() {return city;}
    public String getState() {return state;}

    public abstract void printGeneralInfo();
}
