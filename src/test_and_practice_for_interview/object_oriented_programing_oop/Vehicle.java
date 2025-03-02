package test_and_practice_for_interview.object_oriented_programing_oop;

public class Vehicle {

    private String name;
    private String make;
    private String model;
    private int year;

    public Vehicle(String name, String make, String model, int year) {
        setName(name);
        setMake(make);
        setModel(model);
        setYear(year);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
