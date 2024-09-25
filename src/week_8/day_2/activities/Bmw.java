package week_8.day_2.activities;

public class Bmw extends Vehicle {

    public String headlightTypes;

    public Bmw(String companyName,
               String make,
               String model,
               String trim,
               int year,
               String color,
               int numberOfWheels,
               String headlightTypes) {
        super(companyName, make, model, trim, year, color, numberOfWheels);
        this.headlightTypes = headlightTypes;
    }
}
