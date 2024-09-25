package week_7.lab_session.guessinggame;

public class GameRunner {

    public static void main(String[] args) {

//        GameConfig config = new GameConfig(1, 100);
//        FeedBack feedBack = new FeedBack();
//        UserInput userInput = new UserInput();
//        GuessingGame game = new GuessingGame(
//                config,
//                feedBack,
//                userInput
//        );

        GuessingGame game = new GuessingGame(1, 100);
        game.startGame();

    }

}
