package week_10.management_systems.library_ms;

import java.util.ArrayList;
import java.util.List;

public class Member {

    // Attributes
    private final String memberId;
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final List<Book> borrowedBooks;

    // Constructor
    public Member(String memberId, String name, String email, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getMemberId() {return memberId;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}
    public List<Book> getBorrowedBooks() {return borrowedBooks;}

    // Method to borrow book
    public void borrowBook(Book book) {borrowedBooks.add(book);}

    // Method to return book
    public void returnBook(Book book) {borrowedBooks.remove(book);}

    // ToString Method
    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size();
    }
}

