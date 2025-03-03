package test_and_practice_for_interview.interview_question_reverse_string_builder;

public class App {

    public static void main(String[] args) {
        // way 2:
        var config = new Config("Hello Humans!");
        config.printReversedVersion();

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //        // way 1: using *(loop)* to get reverse string

//        String message = "Hello Humans!";
//        String reversedVersion = "";
//
//        for (int index = message.length()-1; index >= 0; index--){
//            reversedVersion = reversedVersion + message.charAt(index);
//        }
//        System.out.println(reversedVersion);

    }
}
