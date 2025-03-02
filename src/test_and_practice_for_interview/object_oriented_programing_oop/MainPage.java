package test_and_practice_for_interview.object_oriented_programing_oop;

public class MainPage {
    public static void main(String[] args) {

        StudentInfo firstStudentObj = new StudentInfo(
                1,
                "Mike",
                "Morphy",
                "Houston,TX",
                100,
                'A'
        );

        StudentInfo secondStudentObj = new StudentInfo(
                2,
                "James",
                "Alexander",
                "Houston,TX",
                89,
                'B'
                );

        firstStudentObj.printStudentInfo();
        secondStudentObj.printStudentInfo();

        System.out.println("First student firstName: " + firstStudentObj.getFirstName());









    }
}
