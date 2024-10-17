package week_11.day_2.review.interface_topic;

public class Student extends GeneralInformation implements CommandersInterface {

    public Student(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void print() {
        System.out.println("FirstName: " + getFirstName() );
        System.out.println("LastName: " + getLastName() );
        System.out.println("Age: " + getAge() );
        System.out.println("Address: " + getAddress() );
        System.out.println("Class Start Time: " + classStartTime );
        System.out.println("Class end Time: " + classEndTime );
        System.out.println("Teacher Name: " + teacherName );
        System.out.println("Class Name: " + className );
    }

}
