package week_11.day_2.review.polymorphism;

public class ClassA {

        /*

        * 1. Method Overloading --> Multiple method with the same name, but different number of parameters,
                                    different number of data types
                                    different return type as well.

        * 2. Method Overriding --> Multiple methods with the same name, but different implementation
                                --> This will happen when we use inheritance.
        * */

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public void print() {
        System.out.println("Calculator ClassA, Super class.");
    }

}
