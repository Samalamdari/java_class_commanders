package test_and_practice_for_interview.polymorphism;

public class Bird extends Animal{

    public Bird(String color, String name) {
        super(color, name);
    }
    @Override
    public void eat(){
        System.out.println("Bird is eating.");
    }
}
