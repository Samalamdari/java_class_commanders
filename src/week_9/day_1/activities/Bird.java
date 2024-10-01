package week_9.day_1.activities;

public class Bird extends Animal {

    public Bird(String color, String name) {
        super(color, name);
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is making sound.");
    }


}
