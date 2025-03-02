package week_8.day_1.activities;

public class StudentInfo {

    String firstName;
    String lastName;
    int socialSecurityNumber; // optional Field

    public StudentInfo(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public StudentInfo(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this(firstName, lastName, 0);
    }

    public StudentInfo(String firstName) {
        this(firstName, "", 0);
    }

}

class StudentRunner {

    public static void main(String[] args) {

        StudentInfo johnObj = new StudentInfo(
                "John",
                "Doe"
        );

        StudentInfo tonyObj = new StudentInfo(
                "Tony",
                "Morphy",
                555
        );

        StudentInfo jamesObj = new StudentInfo(
                "James"
        );

        System.out.println( johnObj.firstName );
        System.out.println( johnObj.lastName );

        System.out.println( johnObj.socialSecurityNumber );
        System.out.println( tonyObj.socialSecurityNumber );

        System.out.println(jamesObj.firstName);

    }



}
