package test_and_practice_for_interview.string_with_collections;

public class App {

    public static void main(String[] args) {

        String[] names = {"Bob","Jack","Bob","Tony"};
        var config = new Config(
                names,
                "Eric"
        );
        config.printListOfTargetIndexes();
        config.printNumberOfTargetCharacters();

    }
}
