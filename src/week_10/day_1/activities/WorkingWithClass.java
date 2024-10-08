package week_10.day_1.activities;

public abstract class WorkingWithClass {

    final String  name = "Bob";
    String lastName;

    public WorkingWithClass() {
        lastName = "";
    }

    public abstract void print();

    public void printMessage() {
        System.out.println( "Hello Humans!" );
    }

}
