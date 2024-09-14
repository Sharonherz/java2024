package SharonFinalProj;

public class Library extends Shelf {
    private Shelf[] shelves = new Shelf[3];
    private Reader[] readers = new Reader[15];

    public Library( Shelf[] shelves, Reader[] readers) {
        super();
        this.shelves = shelves;
        this.readers = readers;
    }

    public boolean isTherePlaceForNewBook() {
        for (int i = 0; i < 4; i++) {
            if (shelves[i].isSheFull()) {
                return false;
            }
        }
        return false;
    }
    public void deleteBook(String title2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (equalsBooks(this.shelves[i].getBook(j).getTitle(),title2)) {
                    this.shelves[i].replaceBooks(j,this.shelves[i].getCount());
                    this.shelves[i].setBook(this.shelves[i].getCount());
                    this.shelves[i].setCount(this.shelves[i].getCount()-1);
                    return;
                }
            }
        }
    }

    public void registerReader(String name,Book[] b ,int id){
        for(int i = 0; i < 15; i++){
            if(readers[i] == null){
                readers[i] = new Reader(name, null, id);
                return;
            }
        }
    }

    public void removeReader(String name){
        for(int i = 0; i < 15; i++){
            if(readers[i].getName().equals(name)){
                readers[i] = null;
                return;
            }
        }
    }

    public String searchByAuthor(String author) {
        String error = "Auther not found!";
        String allTheAuthorsBooks = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.shelves[i].getBook(j) != null) {
                    if (j <= this.shelves[i].getCount()) {
                        if ((equalsAuther(this.shelves[i].getBook(j).getAuther(), author))) {
                            allTheAuthorsBooks = allTheAuthorsBooks + "|" + this.shelves[i].getBook(j).getTitle() + "|";
                        }
                    }
                }
            }
        }
        if(allTheAuthorsBooks.equals("")){
            System.out.println(error);
            return error;
        }else {
            System.out.println(allTheAuthorsBooks);
            return allTheAuthorsBooks;
        }
    }

}