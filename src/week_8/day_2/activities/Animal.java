package week_8.day_2.activities;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {this.name = name;}
    private void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public void eat() {
        System.out.println( getName() +  " eating.");
    }

    public void sleep() {
        System.out.println( getName() + " sleeping." );
    }

}
