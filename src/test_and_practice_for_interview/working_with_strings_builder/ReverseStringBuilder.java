package test_and_practice_for_interview.working_with_strings_builder;

public class ReverseStringBuilder {

    public static void main(String[] args) {

        String messageTwo = "Commanders Class!";
//        String message = "Hello World";
//        String reversedString = "";
//
//        System.out.println(message.length()-1);
//        System.out.println(message.charAt(0));
//        System.out.println(message.charAt(10));
//
//        for (int index = message.length()-1; index >= 0; index --){
//            reversedString = reversedString + message.charAt(index);
//        }
//        System.out.println("reversed value: " + reversedString);
//        System.out.println("original value: " + message);

//        System.out.println(reverseString(messageTwo));
//        System.out.println(reverseString("TekSchool"));
//        System.out.println(reverseString("Java is not easy."));
//        System.out.println(reverseString("Windy Day!"));
        System.out.println("String Builder:   " + reverseStringVersionTwo(messageTwo));

    }

    public static String reverseString(String str){

        String reversedStringTwo = "";

        for (int index = str.length()-1; index >= 0; index -- ){
            reversedStringTwo = reversedStringTwo + str.charAt(index);
            System.out.println((index + 1) + "==> " + reversedStringTwo);
        }
       return reversedStringTwo;

    }

    // use StringBuilder

    public static StringBuilder reverseStringVersionTwo(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        return strBuilder.reverse();
    }
}
