package week_7.day_2.activities.practiceencapsulation;

public class Vehicle {

    private String name;
    private String make;
    private String model;
    private int year;

    /**
    * @name new value for name variable
     * @make make value
     * @model model value
     * @year year value
    * */
    public Vehicle(String name, String make, String model, int year) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.year = year;
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
}
