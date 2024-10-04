package week_9.lab_session;

public abstract class Vehicle {

    public String companyName;
    public String trim;
    public String make;
    public String model;
    public int year;

    public abstract void print();
    public abstract void start();
    public abstract void stop();
    public abstract int fuelCapacity();


}
