package SharonFinalProj;

public class Book {
    private String auther;
    private String title;
    private int numOfPages;

    public Book(String auther, String title, int numOfPages) {
        this.auther = auther;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuther() {
        return this.auther;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
