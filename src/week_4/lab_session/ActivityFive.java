package week_4.lab_session;

public class ActivityFive {

    /*
    Bookshelf Organizer:

    Objective: Store a collection of book titles and retrieve a book by its position on the shelf.

    Steps:

    Declare a 1D array to hold a certain number of book titles.
    Assign a book title to each position in the array.
    To find the title of the book that's 3rd from the left, access the element at index 2.
    Print the book title retrieved from the array.

*/

    public static void main(String[] args) {

        String[] bookTitles = new String[3];

        // Store book titles
        bookTitles[0] = "Java";
        bookTitles[1] = "TypeScript";
        bookTitles[2] = "Python";

        // Print the third element from the left
        System.out.println("Third book title: " + bookTitles[2] );

    }

}
