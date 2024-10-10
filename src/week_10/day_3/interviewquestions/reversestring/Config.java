package week_10.day_3.interviewquestions.reversestring;

public class Config {

    // Variables
    private String message;
    private String reversedVersion;
    private final StringBuilder strBuilder;
    private char[] characters;

    // Constructor
    public Config(String message) {
        setMessage(message);
        setCharacters(getMessage().toCharArray());
        strBuilder = new StringBuilder();
        setReversedVersion("");
//        reverseString();
        reverseVersionUsingStringBuilder();
    }

    // Setters
    private void setMessage(String message) { this.message = message; }
    private void setReversedVersion(String reversedVersion) { this.reversedVersion = reversedVersion; }
    private void setCharacters(char[] characters) {this.characters = characters;}

    // Getters
    public String getMessage() { return this.message; }
    public String getReversedVersion() { return this.reversedVersion; }
    public StringBuilder getStrBuilder() { return this.strBuilder; }
    public char[] getCharacters() {return characters;}

    // Method to reverse string
    private String reverseString() {
        for ( int index = getMessage().length() - 1; index >= 0; index-- ) {
//            reversedVersion = getReversedVersion() + getMessage().charAt(index);
//            reversedVersion += getMessage().charAt(index);
            setReversedVersion( getReversedVersion() + getMessage().charAt(index) );
        }
        return getReversedVersion();
    }

    private String reverseVersionUsingStringBuilder() {
        for (int index = getCharacters().length - 1; index >= 0; index-- ) {
            setReversedVersion( strBuilder.append( getCharacters()[index] ).toString() );
        }
        return getStrBuilder().toString();
    }

    public void printReversedVersion() {
        System.out.println("Original Version: " + getMessage() );
        System.out.println("Reversed Version: " + getReversedVersion());
    }


}
