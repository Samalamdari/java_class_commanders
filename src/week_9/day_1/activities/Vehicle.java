package week_9.day_1.activities;

// Abstract class representing a generic vehicle
public abstract class Vehicle {

    // Private properties of the Vehicle class
    private String make;
    private String model;
    private int year;
    private String color;

    // Parameterized constructor for Vehicle
    public Vehicle(String make, String model, int year, String color) {
        setMake(make);
        setModel(model);
        setYear(year);
        setColor(color);
    }

    // Public getter for make
    public String getMake() {
        return make;
    }

    // Public getter for model
    public String getModel() {
        return model;
    }

    // Public getter for year
    public int getYear() {
        return year;
    }

    // Public getter for color
    public String getColor() {
        return color;
    }

    // Private setter for make
    private void setMake(String make) {
        this.make = make;
    }

    // Private setter for model
    private void setModel(String model) {
        this.model = model;
    }

    // Private setter for year
    private void setYear(int year) {
        this.year = year;
    }

    // Private setter for color
    private void setColor(String color) {
        this.color = color;
    }

    // Abstract method to start the vehicle
    public abstract void start();

    // Abstract method to stop the vehicle
    public abstract void stop();

    // Abstract method to honk the horn
    public abstract void honk();
}
