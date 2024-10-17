package week_11.day_1.activities.quiz_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {

    // Fields
    private final List<QuestionsRecord> questions;
    private int correctAnswers;
    private int incorrectAnswers;

    // Constructor
    public QuizApp() {
        this.questions = new ArrayList<>();
        this.correctAnswers = 0;
        this.incorrectAnswers = 0;
        loadQuestions();
    }

    // Method to add questions to list of Question!
    private void loadQuestions() {
        questions.add( new QuestionsRecord (
                "How many primitive data types do we have in java?",
                new String[]{"1: 4", "2: 5", "3: 6", "4: 8" },
                4
        ) );
        questions.add( new QuestionsRecord (
                "What is the result of 2+2?",
                new String[]{"1: 2", "2: 4", "3: 3", "4: 1" },
                2
        ));
        questions.add( new QuestionsRecord (
                "How many loops do we have in java?",
                new String[]{"1: 4", "2: 3", "3: 2", "4: 1" },
                1
        ));
        questions.add( new QuestionsRecord (
                "Which company created java?",
                new String[]{"1: Microsoft", "2: Google", "3: Oracle", "4: FaceBook" },
                3
        ));
        questions.add( new QuestionsRecord (
                "What does the final keyword indicate when used with a class?",
                new String[]{"1: The class can be inherited", "2: The class cannot be inherited", "3: The class cannot be instantiated", "4: The class can only have final methods" },
                2
        ));
    }

    // Method to get user input of type int (Because correct answer is type of int)
    private int getUserAnswer(Scanner scanner) {
        System.out.print("Your Answer (1-4): ");
        return scanner.nextInt();
    }

    // Method to print Questions and choices
    private void displayQuestions(QuestionsRecord question) {
        System.out.println( question.questionText() );
        for ( String choice : question.choices() ) {
            System.out.println(choice);
        }
        System.out.flush();
    }

    // Method to display result text after quiz is finished
    private void displayResult() {
        int totalQuestions = questions.size();
        int score = ( correctAnswers * 100 ) / totalQuestions;
        System.out.println("Quiz is over!");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + incorrectAnswers);
        System.out.println("Your score is: " + score + "%");
    }

    // Public method  to connect all the pieces together and run the game
    public void startQuiz() {
        var scanner = new Scanner(System.in);
        for ( QuestionsRecord question : questions ) {
            displayQuestions(question);
            final int userAnswer = getUserAnswer(scanner);
            if ( isUserEnteredCorrectOption(userAnswer) ) displayIncorrectOptionSelected();
            else {
                if (question.isCorrect(userAnswer)) {
                    correctAnswers++;
                } else {
                    incorrectAnswers++;
                }
            }
        }
        displayResult();
        scanner.close();
    }

    // Method to check if user selected a correct range of options.
    private boolean isUserEnteredCorrectOption(int userAnswer) {
        return userAnswer > 4;
    }

    // Method to display a message if the user selected choice is incorrect.
    private void displayIncorrectOptionSelected() {
        System.out.println("Incorrect option is selected, please enter the correct option.");
    }

}
