package week_4.day_1.activities;
import java.util.Scanner;

public class PrintDaysOfTheWeekUsingSwitchStatement {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int userInput;

            System.out.print("Please enter a number to print a day: ");
            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Saturday");
                    break;
                case 2:
                    System.out.println("Sunday");
                    break;
                case 3:
                    System.out.println("Monday");
                    break;
                case 4:
                    System.out.println("Tuesday");
                    break;
                case 5:
                    System.out.println("Wednesday");
                    break;
                case 6:
                    System.out.println("Thursday");
                    break;
                case 7:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Invalid value, please enter a number between 1 to 7!");
            }
    }
}

