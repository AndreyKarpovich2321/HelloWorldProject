package tms.karpovich.lesson16;

public class Book {
    private String author;
    private String bookTitle;
    private int yearOfPublishing;

    public Book(String author, String bookTitle, int yearOfPublishing) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return author + ": " + bookTitle + " - " + yearOfPublishing;
    }
}
