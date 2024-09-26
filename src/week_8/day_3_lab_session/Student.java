package week_8.day_3_lab_session;

public class Student {

    public String firstName;
    public String lastName;
    int age;

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println( firstName );
        System.out.println( lastName );
        if ( age == 0 ) { }
        else System.out.println( age );

    }

}
