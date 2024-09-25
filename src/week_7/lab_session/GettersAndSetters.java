package week_7.lab_session;

public class GettersAndSetters {

    // Attributes
    private String firstName;
    private int age;
    private String dateOfBirth;
    private String className;

    // Default Constructor
    public GettersAndSetters(String firstName, int age, String dateOfBirth) {
        setFirstName(firstName);
        setAge(age);
        setDateOfBirth(dateOfBirth);
        setClassName("Commanders!");
    }

    // Setters
    private void setFirstName( String firstName ) {
        if ( firstName == null ) {
            throw new IllegalArgumentException("firstName cannot be null");
        } else {
            this.firstName = firstName;
        }
    }
    private void setAge( int age ) {
        if ( age <= 17 ) {
            throw new IllegalArgumentException("Age cannot be 17 or less.");
        } else {
            this.age = age;
        }
    }
    private void setDateOfBirth( String dateOfBirth ) { this.dateOfBirth = dateOfBirth; }
    private void setClassName( String className ) { this.className = className; }

    // Getters
    public String getFirstName() {return this.firstName;}
    public int getAge() { return this.age; }
    public String getDateOfBirth() { return this.dateOfBirth; }
    public String getClassName() { return this.className; }

    // Method to print info
    public void printInfo() {
        System.out.println("FirstName: " + getFirstName() );
        System.out.println("Age: " + getAge() );
        System.out.println("Date Of Birth: " + getDateOfBirth() );
        System.out.println("ClassName: " + getClassName() );
    }

}
