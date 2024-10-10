package week_10.day_3.interviewquestions.stringwithcollections;


public class App {

    public static void main(String[] args) {

        String[] names = {"Bob", "Jack", "Bob", "Tony"};
        var config = new Config(
                names,
                "Eric"
        );

        config.printListOfTargetIndexes();
        config.printNumberOfTargetCharacters();

        System.out.println( " * * * * * * *  * * * * * * *  * * * * * * * " );

        config.printNumberOfTargetCharactersSolutionTwo();

    }


}
