package week_9.lab_session;

public class LoginSystem {

    private String hashedPassword;

    // Constructor
    public LoginSystem() {
        this.hashedPassword = "TekIsCool#!";
    }

    private void setHashedPassword(String hashedPassword) {this.hashedPassword = hashedPassword;}
    private String getHashedPassword() {return hashedPassword;}

    public boolean checkPassword(String password) {
        if ( password.equals( getHashedPassword() ) ) return true;
        else return false;
    }

}
