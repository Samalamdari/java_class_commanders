package week_9.day_1.activities;

public class Husky extends Animal {

    public Husky(String color, String name) {
        super(color, name);
    }

    @Override
    public void eat() {
        System.out.println("Husky is eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Husky is barking!");
    }


}
