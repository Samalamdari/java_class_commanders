package week_8.day_2.activities;

public class Vehicle {

    public String companyName;
    public String make;
    public String model;
    public String trim;
    public int year;
    public String color;
    public int numberOfWheels;

    public Vehicle(
           String companyName,
           String make,
           String model,
           String trim,
           int year,
           String color,
           int numberOfWheels
   ) {
        this.companyName = companyName;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
}
