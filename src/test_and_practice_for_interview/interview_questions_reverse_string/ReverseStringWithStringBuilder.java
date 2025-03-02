package test_and_practice_for_interview.interview_questions_reverse_string;

public class ReverseStringWithStringBuilder {

    public static void main(String[] args) {

        String message = "Hello Commanders!";
        char[] characters = message.toCharArray();

        StringBuilder strBuilder = new StringBuilder();

        for (int index = characters.length - 1;index >= 0; index--){
            System.out.print(characters[index]);    // way : 1
            strBuilder.append(characters[index]);   // way : 2
        }
        System.out.println();
        System.out.println(strBuilder);             // way : 2
    }
}
