package week_9.day_1.activities;

class Car extends Vehicle {
    // Additional property specific to Car
    private final int numberOfDoors;

    // Parameterized constructor for Car
    public Car(String make, String model, int year, String color, int numberOfDoors) {
        super(make, model, year, color); // Call to the parent constructor
        this.numberOfDoors = numberOfDoors; // Direct assignment as this setter is not private
    }

    // Implementation of the start method
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Implementation of the stop method
    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    // Implementation of the honk method
    @Override
    public void honk() {
        System.out.println("The car is honking its horn.");
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}