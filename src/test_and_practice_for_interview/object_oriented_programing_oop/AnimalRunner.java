package test_and_practice_for_interview.object_oriented_programing_oop;

public class AnimalRunner {

        /**
         * Main method to create Animal objects and display their details.
         *
         * @param args Command line arguments (not used)
         */
        public static void main(String[] args) {
            // Creating Animal objects
            Animal lion = new Animal("Lion", 5, "Golden", "Savannah", 190.5);
            Animal dolphin = new Animal("Dolphin", 8, "Gray", "Ocean", 150.3);

            // Printing animal details
            System.out.println("Lion information: ");
            lion.printAnimalInfo();

            System.out.println("Dolphin information: ");
            dolphin.printAnimalInfo();
        }

    }

