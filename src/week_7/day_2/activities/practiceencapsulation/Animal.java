package week_7.day_2.activities.practiceencapsulation;

/**
 * The Animal class represents an animal with specific attributes.
 */
public class Animal {

    // Private variables to hold the properties of the animal
    private String type;
    private String habitat;
    private int age;
    private double weight;
    private String diet;

    /**
     * Constructor to initialize the Animal object with given values.
     *
     * @param type    The type of the animal (e.g., Mammal, Reptile).
     * @param habitat The habitat where the animal lives (e.g., Forest, Desert).
     * @param age     The age of the animal in years.
     * @param weight  The weight of the animal in kilograms.
     * @param diet    The diet of the animal (e.g., Herbivore, Carnivore).
     */
    public Animal(String type, String habitat, int age, double weight, String diet) {
        setType(type);
        setHabitat(habitat);
        setAge(age);
        setWeight(weight);
        setDiet(diet);
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Private setter for type
    private void setType(String type) {
        this.type = type;
    }

    // Getter for habitat
    public String getHabitat() {
        return habitat;
    }

    // Private setter for habitat
    private void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Private setter for age
    private void setAge(int age) {
        this.age = age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Private setter for weight
    private void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter for diet
    public String getDiet() {
        return diet;
    }

    // Private setter for diet
    private void setDiet(String diet) {
        this.diet = diet;
    }

    /**
     * Prints the information of the Animal.
     */
    public void printInfo() {
        System.out.println("Animal Type: " + getType());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Diet: " + getDiet());
    }
}