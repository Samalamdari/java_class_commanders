package week_8.day_2.activities;

public class Toyota extends Vehicle {

    public boolean isHybrid;

    public Toyota(
            String companyName,
            String make,
            String model,
            String trim,
            int year,
            String color,
            int numberOfWheels,
            boolean isHybrid
    ) {
        super(companyName, make, model, trim, year, color, numberOfWheels);
        this.isHybrid = isHybrid;
    }
}
