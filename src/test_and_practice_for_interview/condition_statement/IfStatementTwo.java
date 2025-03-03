package test_and_practice_for_interview.condition_statement;

public class IfStatementTwo {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
//        if (num1 > 0 && num1 <= 10) {
//            System.out.println("num1 = " + num1);
//        } else {
//            System.out.println(" enter valid value.");
//        }

        if (num1 == 11 || num1 >= 11) {
            System.out.println("num1 is: " + num1);
        }else if (num2 > 0 && num2 < 4) {
            System.out.println("num2 is: " + num2);
        }else {
            System.out.println("Enter valid value.");
        }
    }
}
