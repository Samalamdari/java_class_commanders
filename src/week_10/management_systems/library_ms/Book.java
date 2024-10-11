package week_10.management_systems.library_ms;

public class Book {

    // Attributes
    private final String ISBN;
    private final String title;
    private final String author;
    private final String publisher;
    private final int yearOfPublication;
    private boolean isAvailable;

    // Constructor
    public Book(String ISBN, String title, String author, String publisher, int yearOfPublication) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.isAvailable = true;
    }

    // Getters
    public String getISBN() {return ISBN;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getPublisher() {return publisher;}
    public int getYearOfPublication() {return yearOfPublication;}
    public boolean isAvailable() {return isAvailable;}

    // Setter
    public void setAvailability(boolean isAvailable) {this.isAvailable = isAvailable;}

    // ToString Method
    @Override
    public String toString() {
        return title + " by " + author + " (" + yearOfPublication + ") - " + ( isAvailable ? "Available" : "Not Available" );
    }
}

