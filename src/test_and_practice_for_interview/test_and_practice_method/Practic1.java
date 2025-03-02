package test_and_practice_for_interview.test_and_practice_method;

public class Practic1 {

    //  Methods

    public static void main(String[] args) {


        // call method here
        printWelcomeMessage();
       printCommandersMessage();
        System.out.println(addThreeNumbers(10,20,30));


    }

    public static void printWelcomeMessage(){
        System.out.println("Welcome to TekSchool!");
    }
    public static void printCommandersMessage(){
        System.out.println("Commanders Class!");
    }
    public static int addThreeNumbers(int numberOne, int numberTwo, int numberThree){
        return numberOne + numberTwo + numberThree;

    }



}
