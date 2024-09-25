package week_7.day_3.activities;

public class StudentRunner {

    public static void main(String[] args) {

        StudentInformation stdObj = new StudentInformation();

        StudentInformation stdTwoObj = new StudentInformation();

        stdObj.schoolYear = "2024";
        stdObj.grade = 'A';
        stdObj.middleName = "D";
        stdObj.lastName = "Doe";
        stdObj.dateOfBirth = "12/21/1995";

        stdObj.printStudentInfo();


        stdTwoObj.printStudentInfo();



    }

}
