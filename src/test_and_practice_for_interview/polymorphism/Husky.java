package test_and_practice_for_interview.polymorphism;

public class Husky extends Animal {

    public Husky(String color, String name) {
        super(color, name);
    }
    @Override
    public void eat(){
        System.out.println("Husky is eating.");
    }
}
