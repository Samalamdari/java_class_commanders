package test_and_practice_for_interview.string_builder_buffer;

public class StringBuilderPractice {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append("Tony");
        System.out.println(stringBuilder);

        stringBuilder.append(" Morphy");
        System.out.println(stringBuilder);

        stringBuilder.append(" junior");
        System.out.println(stringBuilder);

        System.out.println("***********************************");

        stringBuffer.append("Mike");
        System.out.println(stringBuffer);

        stringBuffer.append(" John");
        System.out.println(stringBuffer);



    }
}
