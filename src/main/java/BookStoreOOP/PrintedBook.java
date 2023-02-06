package BookStoreOOP;

public class PrintedBook extends Book{

    int amountOfPages;

    public PrintedBook(String name, String authorName, int id, double price, boolean isAvailable, int amountOfPages) {
        super(name, authorName, id, price, isAvailable);
        this.amountOfPages = amountOfPages;
    }
    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("Amount of pages: " + amountOfPages);
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

}
