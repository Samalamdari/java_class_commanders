package week_8.day_2.activities;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println( getName() + " is flying. "  );
    }

}
