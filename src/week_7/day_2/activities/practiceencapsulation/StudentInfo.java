package week_7.day_2.activities.practiceencapsulation;

public class StudentInfo {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double score;
    private char grade;

    public StudentInfo(int id, String firstName, String lastName, String address, double score, char grade) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setScore(score);
        setGrade(grade);
    }

    // Getters & Setters
    // Getters --> Will give you the value of your variable
    // Syntax
    // public ReturnType getVariableName() {
    //  return the value of variable;
    // }
    public int getId(){return this.id;}
    public String getFirstName() {return this.firstName;}
    public String getLastName() { return this.lastName; }
    public String getAddress() { return this.address; }
    public double getScore() { return this.score; }
    public char getGrade() { return this.grade; }
    // Setters --> Will set a new value to variable
    // Syntax
    // public void setVariableName( DataType nameOfYourVariable ) {
    //  this.variableName = variableName;
    // }
    private void setId( int id ) {
        this.id = id;
    }
    private void setFirstName( String firstName ) {
        if ( firstName == null ) System.out.println("Null cannot be assigned to firstName.");
        else this.firstName = firstName;
    }
    private void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    private void setAddress( String address ) {
        this.address = address;
    }
    private void setScore( double score ) {
        this.score = score;
    }
    private void setGrade( char grade ) {
        this.grade = grade;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + getId());
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Score: " + getScore());
        System.out.println("Grade: " + getGrade());
    }

}
