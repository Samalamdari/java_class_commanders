package week_9.day_2.activities;

public abstract class Animal {

    public abstract void eat();

}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("dog is eating meat!");
    }

}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird is eating!");
    }

}

class AnimalTest {

    public static void main(String[] args) {

        Dog husky = new Dog();
        husky.eat();

    }
}
