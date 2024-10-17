package week_11.day_2.review;

import week_11.day_2.review.encapsulation.Encapsulation;

public class InheritanceRunner {

    public static void main(String[] args) {

        Encapsulation employeeOne = new Encapsulation(
                 "John",
                "Doe",
                10
        );

        Inheritance inheritanceObj = new Inheritance(
                "Tony",
                "Morphy",
                55,
                "Alexandria, VA"
        );

        employeeOne.printInfo();
        inheritanceObj.printInheritance();


    }

}
