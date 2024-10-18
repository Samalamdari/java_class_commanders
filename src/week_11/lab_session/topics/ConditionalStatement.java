package week_11.lab_session.topics;

public class ConditionalStatement {

    public static void main(String[] args) {

        // if ( condition OR Conditions ) {  }
        int score = 82;
        char grade;

//        if ( score >= 90) {
//            grade = 'A';
//        } else if ( score >= 80 ) {
//            grade = 'B';
//        } else if ( score >= 70 ) {
//            grade = 'C';
//        } else if ( score >= 60 ) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }

        if ( score >= 90) grade = 'A';
         else if ( score >= 80 ) grade = 'B';
         else if ( score >= 70 ) grade = 'C';
         else if ( score >= 60 ) grade = 'D';
         else grade = 'F';

        System.out.println( grade );


        /*
        * switch ( value ) {
        *   case value to be checked:
        *       what needs to be done
        *       break;
        *   default:
        *       what needs to be done
        * }
        * */
        int dayOfTheWeek = 0;

        switch ( dayOfTheWeek ) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid value.");
        }

        /*
        * ( condition ) ? true : false
        * */

        System.out.println( (10 < 20 ) ? 10 : 20 );

        int numberOne = 10;
        int numberTwo = 20;

        if ( numberOne < numberTwo ) {
            System.out.println( numberOne );
        } else {
            System.out.println( numberTwo );
        }


    }

}


