package week_11.day_1.activities.interview_question;

public class MaxAndMinValueInMap {

    public static void main(String[] args) {

        var mapConfig = new Config("WWWeel");

        mapConfig.printEntriesOfMap();

//        addCharactersToMapSolutionTwo();
//        printEntriesOfMapSolutionTwo();

        mapConfig.findAndPrintMaxCharacterCount();
        mapConfig.findAndPrintMinCharacterCount();

        mapConfig.findAndPrintMaxCharacterCountSolutionTwo();
        mapConfig.findAndPrintMinCharacterCountSolutionTwo();

        mapConfig.findAndPrintMaxCharacterCountSolutionThree();
        mapConfig.findAndPrintMinCharacterCountSolutionThree();

    }

}
