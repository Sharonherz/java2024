package SharonFinalProj;

import java.util.Objects;

public class Shelf {
    private Book[] books;
    private boolean isSheFull;
    private int count;

    public Shelf() {
    }
    public Shelf(Book[] books, boolean isSheFull) {
        this.books = books;
        this.count = 2;
        this.isSheFull = isSheFull;
    }


    public String addBook(Book book){
        if(!this.isSheFull){
            this.books[this.count + 1] = book;
            this.count += 1;
            return "Success";
        }
        if(this.count > 4){
            this.isSheFull = true;
        }
        return "The Shelf is full";
    }

    public String replaceBooks(int i, int j){
        Book temp = books[i];
        books[i] = books[j];
        books[j] = temp;
        return "Success";
    }

    public boolean isSheFull() {
        return isSheFull;
    }

    public Book getBook(int i) {
        return this.books[i];
    }

    public void setBook( int i) {
        this.books[i] = new Book("","",0);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean equalsBooks(String title1, String title2) {
        if(Objects.equals(title1, title2)){
            return true;
        }
        return false;
    }

    public boolean equalsAuther(String author1, String author2) {
        if(Objects.equals(author1, author2)){
            return true;
        }
        return false;
    }
}
