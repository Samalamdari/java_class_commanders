package week_9.lab_session;

public class ClassA {

    public String firstName;
    public int age;
    public double salary;
    public boolean isActive;

    // Default Constructor
    public ClassA(String firstName, int age, double salary, boolean isActive) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
        this.isActive = isActive;
    }

    public ClassA(String firstName, int age, double salary) {
        this(firstName, age, salary, true);
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isActive=" + isActive +
                '}';
    }
}
