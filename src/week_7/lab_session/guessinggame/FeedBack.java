package week_7.lab_session.guessinggame;

public class FeedBack {

    public void printWelcomeMessage() {
        System.out.println(" * * * * *  * * * * * Welcome to guessing game!  * * * * *  * * * * * ");
        System.out.println("I have selected a number between 1 to 100, try to guess the correct number!");
        System.out.println("Remember, after each incorrect tries, you will lose 10 points out of 100!");
    }

    public void printTooHighMessage() {
        System.out.println("Too high, go low!");
    }

    public void printTooLowMessage() {
        System.out.println("Too low, go high");
    }

    public void printFinalMessage( int attempts ) {
        System.out.println("Congrats, you have found the number after " + attempts + " attempts. ");
    }

}
