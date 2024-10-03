package week_9.day_3.activities;

public class Question {

    /*
    *
    * Question 11: Shadowing Variables

    Step 1: Creating a Class and Main Method

    Create a new Java class named ShadowingDemo.
    Inside the ShadowingDemo class, create a main method.

    Step 2: Declaring Class-Level and Local Variables with Same Name

    Inside the ShadowingDemo class, declare a String variable named name and initialize it with "Class Level".
    Inside the main method, declare a String variable named name and initialize it with "Local Level".

    Step 3: Printing the Value of Shadowed Variable

    Print the value of name inside the main method using System.out.println.
    * */

}

class QuestionTest {

    static String name = "class-level";

    public static void main(String[] args) {

        String name = "";

    }

}


class ShadowingDemo {

//    String name = name;

    public static void main(String[] args) {

        var questionTestObj = new QuestionTest();

        String name = questionTestObj.name;

        System.out.println( name );


    }

}

class shadowingDemoTest {
    static String name="class level";

    public static void main(String[]  args){

        String name="local var";

        System.out.println(name);

//        System.out.println(ShadowingDemo.name);

    }
}



