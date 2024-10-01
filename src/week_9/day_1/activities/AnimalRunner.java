package week_9.day_1.activities;

public class AnimalRunner {

    public static void main(String[] args) {

        Bird eagle = new Bird("Black","Eagle");
        Husky husky = new Husky("White", "Husky");
//        Animal animal = new Animal("Animal Color", "Animal Name");

        eagle.eat();
        husky.eat();
//        animal.eat();

        System.out.println( eagle.name );

    }

}
