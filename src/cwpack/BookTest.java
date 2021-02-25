package cwpack;

public class BookTest {

    public static void main(String[] args) {

        Book bookTest = new Book("'Brave New World'", "Aldous Huxley", "9780099518471", "1994", "hardback");

        System.out.println("Printing original values");
        System.out.println("------------------------");
        System.out.println("Title: " + bookTest.getTitle());
        System.out.println("Author: " + bookTest.getAuthorName());
        System.out.println("Isbn Num: " + bookTest.getIsbnNumber());
        System.out.println("Publication date: " + bookTest.getPublicationDate());
        System.out.println("Format: " + bookTest.getFormat());

        System.out.println();

        System.out.println("Changing original values");
        bookTest.setTitle("'Scary New World'");
        bookTest.setAuthorName("Aldy Hux");
        bookTest.setIsbnNumber("9780099518000");
        bookTest.setPublicationDate("1995");
        bookTest.setFormat("ebook");

        System.out.println();

        System.out.println("Printing new values");
        System.out.println("------------------------");
        System.out.println("Title: " + bookTest.getTitle());
        System.out.println("Author: " + bookTest.getAuthorName());
        System.out.println("Isbn Num: " + bookTest.getIsbnNumber());
        System.out.println("Publication date: " + bookTest.getPublicationDate());
        System.out.println("Format: " + bookTest.getFormat());

    }

}
