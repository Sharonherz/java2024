package SharonFinalProj;

public class Reader {
    private int id;
    private String name;
    private Book[] books;

    public Reader(String name, Book[] books, int id) {
        this.name = name;
        this.books = new Book[15];
        this.id = id;
    }

    public void readBook(Book Book){
        this.books[books.length] = Book;
    }

    public String getName() {
        return name;
    }
}
