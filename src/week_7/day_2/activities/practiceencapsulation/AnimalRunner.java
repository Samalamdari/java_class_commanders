package week_7.day_2.activities.practiceencapsulation;

public class AnimalRunner {


    // Main method to test the Animal class
    public static void main(String[] args) {

        // Creating two Animal objects with different values
        Animal lion = new Animal("Mammal", "Savannah", 5, 190.5, "Carnivore");
        Animal tortoise = new Animal("Reptile", "Desert", 100, 50.0, "Herbivore");

        // Printing the information of the animals
        System.out.println("Lion Information:");
        lion.printInfo();
        System.out.println("\nTortoise Information:");
        tortoise.printInfo();
    }

}

