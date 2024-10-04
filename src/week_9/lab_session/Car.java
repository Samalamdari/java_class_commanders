package week_9.lab_session;

public class Car extends Vehicle {

    public int numberOfDoors;


    @Override
    public void print() {
        System.out.println("CompanyName: " + super.companyName);
    }

    @Override
    public void start() {
        System.out.println("Insert the key, start the engine.");
    }

    @Override
    public void stop() {
        System.out.println("turn off the engine, and remove the key.");
    }

    @Override
    public int fuelCapacity() {
        return 15;
    }

}
