package test_and_practice_for_interview.condition_statement;

public class IfConditionalStatement {

    public static void main(String[] args) {

        int score = 55;
        char grade;
        // syntax
        // if( condition OR conditions ) { }

        if (score >= 90) {
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println(grade);


    }
}
