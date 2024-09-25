package week_7.day_2.activities.practiceencapsulation;

public class Main {

    public static void main(String[] args) {

        StudentInfo firstStudentObj = new StudentInfo(
                1,
                "Mike",
                "Morphy",
                "Alexandria, VA",
                100,
                'A'
        );

        StudentInfo secondStudentObj = new StudentInfo(
                2,
                "James",
                "Alexander",
                "Arlington, VA",
                89,
                'V'
        );

        firstStudentObj.printStudentInfo();
        secondStudentObj.printStudentInfo();





//        System.out.println("First student firstName: " + firstStudentObj.getFirstName() );
//        System.out.println("First student ID: " + firstStudentObj.getId() );


    }

}
