package week_4.day_2.activities;

public class SwitchStatementReview {

    public static void main(String[] args) {

        /*int value = 5;
        * switch ( value ) {
        *
        *       case 1:
        *          System.out.println("A");
        *          break;
        *       case 2:
         *          System.out.println("B");
         *          break;
         *      case 3:
         *          System.out.println("C");
         *          System.out.println("C");
         *          break;
         *      default:
         *          System.out.println("None of the above conditions are true!");
        * }
        * */

        int score = 90;
        switch ( score ) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            default:
                System.out.println("None of the above conditions are true!");
        }
    }

}
