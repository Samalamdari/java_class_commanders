package test_and_practice_for_interview.interface_practice;

public class Runner {

    public static void main(String[] args) {

        var firstStudentObj = new Commanders(
                "David",
                "Roy",
                "Junior",
                45,
                "Houston",
                "Texas"
        );

        firstStudentObj.printGeneralInfo();
        firstStudentObj.printClassInfo();

    }
}
