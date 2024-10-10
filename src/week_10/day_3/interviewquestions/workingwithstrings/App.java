package week_10.day_3.interviewquestions.workingwithstrings;

public class App {

    public static void main(String[] args) {

        var config = new Config("123");
        config.printAll();
        config.printNumbers();
        System.out.println( config.checkIfStringIsPalindrome() );

    }

}
