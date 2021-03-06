
public class Book {

    // instance variables
    String title;
    String authorName;
    String isbnNumber;
    String publicationDate;
    String format;

    // constructor
    public Book(String title, String authorName, String isbnNumber, String publicationDate, String format) {

        this.title = title;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
        this.publicationDate = publicationDate;
        this.format = format;
    }

    // getters and setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return this.isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
