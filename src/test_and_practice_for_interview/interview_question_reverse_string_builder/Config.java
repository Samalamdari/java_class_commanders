package test_and_practice_for_interview.interview_question_reverse_string_builder;

public class Config {
    // way 2 : using *(encapsulation)* to get reverse string

      // variables
    private String message;
    private String reversedVersion;

    // Constructor
    public Config(String message) {
        setMessage(message);
        setReversedVersion("");
        reverseString();
    }
    // Setter
    public void setMessage(String message) {
        this.message = message;
    }
    public void setReversedVersion(String reversedVersion) {
        this.reversedVersion = reversedVersion;
    }
    // Getter
    public String getMessage() {
        return this.message;
    }
    public String getReversedVersion() {
        return this.reversedVersion;
    }
    // method to reverse string
    private String reverseString() {

        for (int index = getMessage().length()-1; index >= 0; index--){
//            reversedVersion = getReversedVersion() + getMessage().charAt(index);  // way 1
//            reversedVersion += getMessage().charAt(index);                        // way 2
            setReversedVersion(getReversedVersion() + getMessage().charAt(index));  // way 3

        }
        return getReversedVersion();
    }
    public void printReversedVersion() {
        System.out.println("Original Version: " + getMessage());
        System.out.println("Reversed Version: " + getReversedVersion());
    }

}
