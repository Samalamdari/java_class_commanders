package week_10.management_systems.library_ms;

import java.util.*;

public class Library {

    // Attributes
    private final List<Book> books;
    private final List<Member> members;
    private final List<Transaction> transactions;
    private final Map<String, Book> bookMap;
    private final Map<String, Member> memberMap;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
        bookMap = new HashMap<>();
        memberMap = new HashMap<>();
    }

    // Book management
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getISBN(), book);
    }

    public void removeBook(String ISBN) {
        Book book = bookMap.get(ISBN);
        if (book != null) {
            books.remove(book);
            bookMap.remove(ISBN);
        }
    }

    public Book findBookByISBN(String ISBN) {
        return bookMap.get(ISBN);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Member management
    public void addMember(Member member) {
        members.add(member);
        memberMap.put(member.getMemberId(), member);
    }

    public void removeMember(String memberId) {
        Member member = memberMap.get(memberId);
        if (member != null) {
            members.remove(member);
            memberMap.remove(memberId);
        }
    }

    public Member findMemberById(String memberId) {
        return memberMap.get(memberId);
    }

    public void printAllMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Borrowing and returning books
    public void issueBook(String memberId, String ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if ( member != null && book != null && book.isAvailable() ) {
            book.setAvailability(false);
            member.borrowBook(book);
            String transactionId = "T" + (transactions.size() + 1);
            Transaction transaction = new Transaction(transactionId, ISBN, memberId);
            transactions.add(transaction);
            System.out.println("Book issued: " + transaction);
        } else {
            System.out.println("Cannot issue book. Either the book is unavailable or the member/book does not exist.");
        }
    }

    public void returnBook(String memberId, String ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);
        if (member != null && book != null && !book.isAvailable()) {
            book.setAvailability(true);
            member.returnBook(book);
            for (Transaction transaction : transactions) {
                if (transaction.getBookISBN().equals(ISBN) && transaction.getMemberId().equals(memberId) && transaction.getReturnDate() == null) {
                    transaction.setReturnDate(new Date());
                    System.out.println("Book returned: " + transaction);
                    break;
                }
            }
        } else {
            System.out.println("Cannot return book. Either the book is already available or the member/book does not exist.");
        }
    }

    // Print all transactions
    public void printAllTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

