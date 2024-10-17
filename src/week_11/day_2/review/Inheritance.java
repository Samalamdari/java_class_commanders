package week_11.day_2.review;

import week_11.day_2.review.encapsulation.Encapsulation;

public class Inheritance extends Encapsulation {

    private String address;

    public Inheritance(
            String firstName,
            String lastName,
            int age,
            String address) {
        super(firstName, lastName, age);
        this.address = address;
    }

    private String getAddress() {return address;}
    private void setAddress(String address) {this.address = address;}

    public void printInheritance() {
        super.printInfo();
        System.out.println("Address: " + getAddress() );
    }
}
