package week_8.day_2.activities;

public class Runner {

    public static void main(String[] args) {

        GrandFather grandFatherObj = new GrandFather(
                "Trevor"
        );

        Father fatherObj = new Father(
                "Tony"
        );

        Child childObj = new Child(
                "James"
        );

        System.out.println( grandFatherObj.firstName );

        System.out.println( fatherObj.firstName );

        System.out.println( childObj.firstName );


    }

}
