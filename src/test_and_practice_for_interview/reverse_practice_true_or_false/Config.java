package test_and_practice_for_interview.reverse_practice_true_or_false;

public class Config {

    // variable
    private String message;
    private String reversedVersion;

    // constructor
    public Config(String message) {
        setMessage(message);
        setReversedVersion("");
        reverseString();
    }
    // private methods
    private String getMessage(){return this.message;}
    private String getReversedVersion(){return this.reversedVersion;}
    private void setMessage(String message){this.message = message;}
    private void setReversedVersion(String reversedVersion){this.reversedVersion = reversedVersion;}

    private String getUpperCaseCharacters(){
        StringBuilder uppercaseCharacters = new StringBuilder();
        for (char character : getMessage().toCharArray()) {
            if (Character.isUpperCase(character)) {
                uppercaseCharacters.append(character);
            }
        }
        return uppercaseCharacters.toString();
    }
    private String getLowerCaseCharacters(){
        StringBuilder lowercaseCharacters = new StringBuilder();
        for (char character : getMessage().toCharArray()) {
            if (Character.isLowerCase(character)) {
                lowercaseCharacters.append(character);
            }
        }
        return lowercaseCharacters.toString();
    }
    private String getNumbersCharacters(){
        StringBuilder numbers = new StringBuilder();
        for (char character : getMessage().toCharArray()) {
            if (Character.isDigit(character)) {
                numbers.append(character);
            }
        }
        return numbers.toString();
    }
    private String getSpecialCharacters(){
        StringBuilder specialCharacters = new StringBuilder();
        for (char character : getMessage().toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                specialCharacters.append(character);
            }
        }
        return specialCharacters.toString();
    }
    public void printUpperCaseCharacters(){
        String upperCaseCharacters = getUpperCaseCharacters();
        if (!upperCaseCharacters.isEmpty()) {
            System.out.println("UpperCase Characters: " + upperCaseCharacters);
        }
    }
    public void printLowerCaseCharacters(){
        String lowerCaseCharacters = getLowerCaseCharacters();
        if (!lowerCaseCharacters.isEmpty()) {
            System.out.println("LowerCase Characters: " + lowerCaseCharacters);
        }
    }
    public void printNumbers(){
        String numbers = getNumbersCharacters();
        if (!numbers.isEmpty()) {
            System.out.println("Numbers Characters: " + numbers);
        }
    }
    public void printSpecialCharacters(){
        String specialCharacters = getSpecialCharacters();
        if (!specialCharacters.isEmpty()) {
            System.out.println("Special Characters: " + specialCharacters);
        }
    }
    public void printAll() {
        printUpperCaseCharacters();
        printLowerCaseCharacters();
        printNumbers();
        printSpecialCharacters();
    }
    // method to reverse String
    private String reverseString() {
        for (int index = getMessage().length() - 1;index >= 0; index --) {
            setReversedVersion(getReversedVersion() + getMessage().charAt(index));
        }
        return getReversedVersion();
    }
    public boolean checkIfStringIsPalindrome() {
        return ((getReversedVersion().equals(getMessage()) ? true : false)); // way 1
//        if (getReversedVersion().equals(getMessage())) {                       // way 2
//            return true;
//        } else {
//            return false;
//        }
    }






}
