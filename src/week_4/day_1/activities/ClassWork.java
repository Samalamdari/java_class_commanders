package week_4.day_1.activities;

import java.util.Scanner;

public class ClassWork {

    /*
    * Write a java program to store some properties of a car and print the full details in the console.
    * */

    public static void main(String[] args) {

        // Arrange
        Scanner input = new Scanner(System.in);
        String carModel, carMake, carYear, carTrim;

        // Act, Action
        System.out.print("Enter the make of the car: ");
        carMake = input.next();

        System.out.print("Enter the model of the car: ");
        carModel = input.next();

        System.out.print("Enter the year of the car: ");
        carYear = input.next();

        System.out.print("Enter the trim of the car: ");
        carTrim = input.next();

        // Assert
        System.out.println( " * * * * * * Car Information * * * * * *  " );
        System.out.println("Car Make: " + carMake);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car year: " + carYear);
        System.out.println("Car Trim: " + carTrim);

        // OR
        System.out.println( " * * * * * * Car Information * * * * * *  " );
        System.out.println( "Car Make: " + carMake + " \n " +
            "Car Model: " + carModel + " \n " +
            "Car Year: " + carYear + " \n " +
            "Car Trim: " + carTrim
        );







    }

}
