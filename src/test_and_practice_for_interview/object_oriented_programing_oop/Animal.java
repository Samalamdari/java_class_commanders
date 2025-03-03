package test_and_practice_for_interview.object_oriented_programing_oop;
    /**
     * The Animal class represents an animal with specific attributes such as type, age, color, habitat, and weight.
     * The class ensures encapsulation by making instance variables private and providing public getters.
     * The setters are private to maintain controlled initialization via the constructor.
     */
    public class Animal {
        // Private instance variables
        private String animalType;
        private int age;
        private String color;
        private String habitat;
        private double weight;

        /**
         * Parameterized constructor to initialize an Animal object.
         * The constructor calls private setter methods to ensure controlled initialization.
         *
         * @param animalType Type of the animal
         * @param age        Age of the animal in years
         * @param color      Color of the animal
         * @param habitat    Natural habitat of the animal
         * @param weight     Weight of the animal in kilograms
         */
        public Animal(String animalType, int age, String color, String habitat, double weight) {
            setAnimalType(animalType);
            setAge(age);
            setColor(color);
            setHabitat(habitat);
            setWeight(weight);
        }

        // Public getter methods

        /**
         * Gets the type of the animal.
         *
         * @return the animal type
         */
        public String getAnimalType() {
            return animalType;
        }

        /**
         * Gets the age of the animal.
         *
         * @return the animal's age
         */
        public int getAge() {
            return age;
        }

        /**
         * Gets the color of the animal.
         *
         * @return the color of the animal
         */
        public String getColor() {
            return color;
        }

        /**
         * Gets the natural habitat of the animal.
         *
         * @return the habitat of the animal
         */
        public String getHabitat() {
            return habitat;
        }

        /**
         * Gets the weight of the animal.
         *
         * @return the weight of the animal in kilograms
         */
        public double getWeight() {
            return weight;
        }

        // Private setter methods to restrict direct modifications
        private void setAnimalType(String animalType) {
            this.animalType = animalType;
        }

        private void setAge(int age) {
            this.age = age;
        }

        private void setColor(String color) {
            this.color = color;
        }

        private void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        private void setWeight(double weight) {
            this.weight = weight;
        }

        /**
         * Prints the details of the Animal object in a structured format.
         */
        public void printAnimalInfo() {
            System.out.println("Animal Type: " + getAnimalType());
            System.out.println("Age: " + getAge() + " years");
            System.out.println("Color: " + getColor());
            System.out.println("Habitat: " + getHabitat());
            System.out.println("Weight: " + getWeight() + " kg");
            System.out.println("----------------------------");
        }
    }

