package test_and_practice_for_interview.polymorphism;

public class Animal {

        String color;
        String name;

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}
