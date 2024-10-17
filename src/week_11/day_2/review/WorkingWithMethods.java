package week_11.day_2.review;

import week_11.day_2.review.encapsulation.Encapsulation;

public class WorkingWithMethods {

    public static void main(String[] args) {

        Encapsulation employeeOne = new Encapsulation(
                null,
                "Doe",
                -1
        );

        Encapsulation employeeTwo = new Encapsulation(
                "Tony",
                "Morphy",
                28
        );

        Encapsulation employeeThree = new Encapsulation(
                "Eric",
                "Alexander",
                24
        );

//        System.out.println( employeeOne.getFirstName() );
//        System.out.println( employeeOne.getLastName() );
//
//        employeeOne.setFirstName("John");
//        System.out.println( employeeOne.getFirstName() );
//
//        employeeOne.setFirstName(null);
//        System.out.println( employeeOne.getFirstName() );



        employeeOne.printInfo();
        employeeTwo.printInfo();
        employeeThree.printInfo();

    }

}
