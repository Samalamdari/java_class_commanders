package week_2.day_2.topics;

public class TheLogicOfPrintln {

    /*
    In Java, System.out.println is a bit like sending a text message to your computer screen, asking it to
    display something. It's one of the simplest ways to output information so that you, the user, can see it.

    Here's a breakdown:

    1: System: Think of this as the main communication line between your Java program and the computer.
    It's a built-in class that Java provides for accessing system resources.

    2: out: This is like choosing which app you'll use to send your text message.
    In this case, out is an instance of the PrintStream class, and it's already set up to send
    data to the standard output, which is usually your console or terminal.

    3: println: This is the action of sending the text. "println" stands for "print line,"
    and it will print whatever you put between its parentheses to the console, followed by a new
    line at the end.

    Put them all together, and System.out.println sends a message to your computer to display a string of text,
    then move to the next line.

*/


    public static void main(String[] args) {

        System.out.print("Welcome to class of commanders!");
        System.out.println(" Hello Commander!");
        System.out.print(" Hello");

        System.out.println();

        System.out.println("Java is easy!");
        // System.err.print("Java is easy!");

        String printName = "Trevor";

        System.out.println( printName );
        printName();

        String name = "John";
        String[] names = { "Tony", "Trevor", "Alex" };

    }

    public static void printName() {
        System.out.println("Hello Tony!");
    }

}
