package week_2.day_2.activities;

public class TypeOfVariablesPractice { // Opening block of the class

    // Declare an instance variable
    String studentMiddleName = "Morphy";

    // Declare class level variable
    static double salary = 150;

    // main Method
    public static void main(String[] args) { // Opening block of the main method

        // Syntax of creating an object
        // NameOfTheClass nameOfTheObject = new NameOfTheClass();
        TypeOfVariablesPractice obj = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj2 = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj3 = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj4 = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj5 = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj6 = new TypeOfVariablesPractice();
//        TypeOfVariablesPractice obj7 = new TypeOfVariablesPractice();

       //  System.out.println( studentName );

        // Declare local variables
        String studentName;
        String studentLastName;
        String studentDateOfBirth;

        // Initialize a value to studentName
        studentName = "Tony";

        // Print the value that is stored in studentName
        System.out.println( studentName );

        // Access studentMiddleName in here
        System.out.println( obj.studentMiddleName );

        // Access the value of the salary
        System.out.println( salary );

        // Call the printStudentName function of method
        printStudentName();


    } // Closing block of the main method


    // System.out.println( studentName ); It's not gonna work because we are outside of the main method

    public static void printStudentName() { // Opening block of the printStudentName function
        String studentName = "Tony";
        System.out.println( studentName );

        System.out.println( salary );

    } // Closing block of the printStudentName function

} // Closing block of the class


