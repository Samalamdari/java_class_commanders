package week_10.management_systems.library_ms;

import java.util.Date;

public class Transaction {

    // Attributes
    private final String transactionId;
    private final String bookISBN;
    private final String memberId;
    private final Date issueDate;
    private Date returnDate;

    // Constructor
    public Transaction(String transactionId, String bookISBN, String memberId) {
        this.transactionId = transactionId;
        this.bookISBN = bookISBN;
        this.memberId = memberId;
        this.issueDate = new Date();
        this.returnDate = null;
    }

    // Getters
    public String getTransactionId() {return transactionId;}
    public String getBookISBN() {return bookISBN;}
    public String getMemberId() {return memberId;}
    public Date getIssueDate() {return issueDate;}
    public Date getReturnDate() {return returnDate;}

    // Setters
    public void setReturnDate(Date returnDate) {this.returnDate = returnDate;}

    // ToString
    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Book ISBN: " + bookISBN + ", Member ID: " + memberId + ", Issue Date: " + issueDate + ", Return Date: " + returnDate;
    }
}

