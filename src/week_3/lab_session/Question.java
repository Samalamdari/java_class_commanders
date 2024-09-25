package week_3.lab_session;

public class Question {

    public static void main(String[] args) {

        // Create an array of Strings named 'name' with two elements
        // The elements are "david" and "JOHN"
        String[] name = {"david", "JOHN"};

        // Convert the first element of the 'name' array to uppercase
        // The result is stored in the variable 'character'
        String character = name[0].toUpperCase();

        // Print the 'name' array to the console
        // This will print the reference of the array, not the contents
        // To print array contents properly, we would need to use Arrays.toString(name)
        System.out.println(name); // This will display something like [Ljava.lang.String;@15db9742

        // Print the 'character' variable to the console
        // This will show "DAVID" because name[0] ("david") was converted to uppercase
        System.out.println(character); // Output: DAVID

        // Create a String variable 'str' with the value "david JOHN"
        String str = "david JOHN";

        // Replace the first occurrence of the letter 'd' with 'D' in the 'str' variable
        // The result is "David JOHN"
        // The replaceFirst method only replaces the first occurrence of the specified character
        System.out.println(str.replaceFirst("d", "D")); // Output: David JOHN

        // Replace the first occurrence of the letter 'd' with 'D' in the first element of the 'name' array
        // The result is "David" because name[0] ("david") has 'd' replaced with 'D'
        // Note: This does not change the original 'name' array, it only affects the returned result
        System.out.println(name[0].replaceFirst("d", "D")); // Output: David

    }

}
