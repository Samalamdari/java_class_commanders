package week_9.day_1.activities;

public abstract class Animal {

    public String color;
    public String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract void eat();
    public abstract void makeSound();

    public void print() {
        System.out.println("Hello Humans!");
    }

}
