package week_10.day_1.activities;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<String> listOfStudents = new ArrayList<>();
        ArrayList<Commanders> listOfCommandersStudents = new ArrayList<>();

        var firstStudentObj = new Commanders(
        "John",
                "Doe",
                "Y",
                28,
                "Alexandria",
                "Virginia"
        );

        var secondStudentObj = new Commanders(
                "Tony",
                "Morphy",
                "J",
                38,
                "Arlington",
                "Virginia"
        );

        var thirdStudentObj = new Commanders(
                "Mike",
                "Alexander",
                "K",
                48,
                "Fair Fax",
                "Virginia"
        );


        // Actions
//        listOfStudents.add( firstStudentObj.getFirstName() );
//        listOfStudents.add( secondStudentObj.getFirstName() );

//        listOfCommandersStudents.add(firstStudentObj);
//        listOfCommandersStudents.add(secondStudentObj);

/*        System.out.println( listOfStudents );


        for ( Commanders obj : listOfCommandersStudents ) {
//            System.out.println( obj.getFirstName() );
//            System.out.println( obj.getLastName() );
//            System.out.println( obj.getMiddleName() );
//            System.out.println( obj.getAge() );
//            System.out.println( obj.getCity() );
//            System.out.println( obj.getState() );
            obj.printGeneralInfo();

        }*/

        firstStudentObj.printArrayList();
        secondStudentObj.printArrayList();
        thirdStudentObj.printArrayList();




    }

}
