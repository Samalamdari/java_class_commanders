package week_10.management_systems.library_ms;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        // Add some books
        library.addBook( new Book
                (
                "789012",
                "Clean Code",
                "Robert C. Martin",
                "Prentice Hall",
                2008
                )
        );

        library.addBook( new Book
                (
                "123456",
                "Effective Java",
                "Joshua Bloch",
                "Addison-Wesley",
                2018
                )
        );

        // Add some members
        library.addMember( new Member
                (
                "M1",
                "Alice",
                "alice@mail.com",
                "1234567890"
                )
        );

        library.addMember( new Member
                (
                "M2",
                "Bob",
                "bob@mail.com",
                "0987654321"
                )
        );

        // Issue and return books
        library.issueBook("M1", "123456");
        library.returnBook("M1", "123456");

        // Display all books, members, and transactions
        library.printAllBooks();
        library.printAllMembers();
        library.printAllTransactions();
    }
}

