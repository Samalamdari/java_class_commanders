package test_and_practice_for_interview.polymorphism;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal color","Animal name");
        Bird eagle = new Bird("Black", "Eagle");
        Husky husky = new Husky("White", "Husky");

        animal.eat();
        eagle.eat();
        husky.eat();

        System.out.println(animal.name + "= " + eagle.name);
        System.out.println(eagle.color);

        System.out.println(animal.color);
        System.out.println(animal.name);
    }
}
