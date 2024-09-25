package week_8.day_1.topics;

public class GettersAndSetters {

     /*
    Real-life Analogy:

    Consider a safety deposit box in a bank. You have certain valuables or information inside the box.
    There's a secure method to access (get) or modify (set) the contents of the box:
    using a key, code, or permission from an authority.

    The Safety Deposit Box: Stores your valuable information (data).
    Using a Key/Code (Getter Method): Safely retrieves the information when needed.
    Modifying Contents (Setter Method): Safely alters the information securely.

    Programming Explanation:

    In Java, and other OOP languages, getter and setter methods are used as part of the encapsulation concept to safely access
     and modify the private variables of a class.

    Getter Method: A public method that is used to retrieve the value of a private variable. It returns the variable value,
    and typically, its name starts with "get" followed by the variable name.

    Setter Method: A public method used to update the value of a private variable. It takes a parameter that updates the
    variable and typically starts with "set" followed by the variable name.

    Benefits:

    Control: Ensures controlled access and modification of the variables.
    Validation: Can add validation to check if the new value is valid before setting it.
    Security: Prevents unauthorized access and modification of data.


    public class BankBox {
        private String valuableInformation;  // Private variable, not accessible directly

        // Getter Method: Safely retrieves the information
        public String getValuableInformation() {
            return valuableInformation;
        }

        // Setter Method: Safely modifies the information after validation
        public void setValuableInformation(String newInfo) {
            // Can add validation logic here
            valuableInformation = newInfo;
        }
    }
*/

}
