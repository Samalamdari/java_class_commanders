package week_11.day_2.review.abstraction;

public abstract class AbstractClass {

    String firstName;
    String lastName;

    public AbstractClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Information{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
