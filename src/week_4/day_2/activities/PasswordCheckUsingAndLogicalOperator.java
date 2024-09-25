package week_4.day_2.activities;

import java.util.Scanner;

public class PasswordCheckUsingAndLogicalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newPassword, confirmNewPassword;
        boolean isChanged;
        int isPasswordChanged;

        System.out.println("You are about to change the password of your account, so please enter the new password and confirm your password");

        // Ask the user for the new password
        System.out.print("Please enter your new password: ");
        newPassword = input.next();

        // Ask the user for the confirmation of the new password
        System.out.print("Please re-enter the new password to confirm: ");
        confirmNewPassword = input.next();

        // Compare the new and the confirmation passwords
        if ( newPassword.equals(confirmNewPassword) ) System.out.println("Your password has been changed!");
        else System.out.println("Passwords doesn't match, please re-enter your password");

        if ( ( newPassword.equals(confirmNewPassword) ) && ( confirmNewPassword.equals(newPassword) ) ) System.out.println("Your password has been changed!");
        else System.out.println("Passwords doesn't match, please re-enter your password");


        // Using conditional operator
       isChanged = ( newPassword.equals(confirmNewPassword) ) ? true : false;

       if ( isChanged ) System.out.println("Your password has been changed!");
       else System.out.println("Passwords doesn't match, please re-enter your password");


       // Check if the password matches
        isPasswordChanged = ( newPassword.equals(confirmNewPassword) ) ? 1 : 0;

        // Use switch in order to display the output for the user
        switch ( isPasswordChanged ) {
            case 1:
                System.out.println("Your password has been changed!");
                break;
            case 0: System.out.println("Passwords doesn't match, please re-enter your password");
                break;
            default:
                System.out.println("Invalid entry!");
        }





    }

}
