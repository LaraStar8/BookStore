package BookStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K. Rowling", 1, 10.5, false, "mp3", 128, "Smith");
        book1.printBookDetails();

        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 20, true, "www.books.com");
        book2.printBookDetails();
        book2.setUsdPrice(10);

        PrintedBook printedBook = new PrintedBook("Must Love Prts","K. Chaos", 3, 7, true, 189);
        printedBook.printBookDetails();

//        book1.setAvailable(true);
//        book2.setUsdPrice(30);
//
//
//        book1.printBookDetails();
//        book2.printBookDetails();
    }
}
