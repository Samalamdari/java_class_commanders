package week_11.day_1.activities.quiz_game;

public record QuestionsRecord(String questionText, String[] choices, int correctAnswer) {

    // Method to check the correct and incorrect response of the user, return true of false based on correct answer
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer();
    }

}
