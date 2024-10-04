package week_9.lab_session;

public class SecurePasswordStorage {

    /*
    * Objective: Learn about hiding implementation details from the user.

Steps:

    1. Create a class called LoginSystem.
    2. Define a private member variable hashedPassword (type String). In a real-world scenario, passwords would be hashed, but for simplicity,
    *  we're just using plain text here.

    3. Implement a method setPassword(String password) which "hashes" the password by reversing it (for simplicity) and then stores it.
    4. Implement a method checkPassword(String password) which "hashes" the input password and checks it against the stored hashed password.
    5. Ensure that there is no direct way to view the hashedPassword from outside the class.
    6. In a main method, set a password, then check a few sample passwords against it.
    * */

    public static void main(String[] args) {

        var objOne = new LoginSystem();
        var objTwo = new LoginSystem();
        var objThree = new LoginSystem();

//        System.out.println( objOne.getHashedPassword() );

        System.out.println( objOne.checkPassword("Login123!") );
        System.out.println( objTwo.checkPassword("Vanguard3!1") );
        System.out.println( objThree.checkPassword("TekIsCool#!") );

    }

}
