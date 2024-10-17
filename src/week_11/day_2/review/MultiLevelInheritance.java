package week_11.day_2.review;

public class MultiLevelInheritance extends Inheritance {

    private String phoneNumber;

    public MultiLevelInheritance(
            String firsName,
            String lastName,
            int age,
            String address,
            String phoneNumber
    ) {
        super(firsName, lastName, age, address);
        this.setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {return phoneNumber;}
    private void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
}
