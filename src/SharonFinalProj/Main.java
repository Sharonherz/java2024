package SharonFinalProj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sharon","JavaProgramming1",100);
        Book book2 = new Book("Tom","JavaProgramming2",100);
        Book book7 = new Book("Adam","JavaProgramming7",100);
        Shelf shelf1 = new Shelf(new Book[]{book1, book2,book7,null,null},false);
        Book book3 = new Book("Sharon","JavaProgramming3",100);
        Book book4 = new Book("Tom","JavaProgramming4",100);
        Shelf shelf2 = new Shelf(new Book[]{book3, book4,null,null,null},false);
        Book book5 = new Book("Sharon","JavaProgramming5",100);
        Book book6 = new Book("Tom","JavaProgramming6",100);
        Shelf shelf3 = new Shelf(new Book[]{book5, book6,null,null,null},false);
        Library library = new Library(new Shelf[]{shelf1,shelf2,shelf3},new Reader[]{null,null,null,null,null,null,null,null,null,null,null,null});

        int exit = 1;
        while(exit != 0) {
            System.out.println("""
                    For adding a book - Press 1.
                    For deleting a book - Press 2.
                    For registering a new reader - Press 3.
                    For removing a reader - Press 4.
                    For searching books by author – Press 5.
                    For exit – Press 6.""");
            Scanner user_input = new Scanner(System.in);
            int num = Integer.parseInt(user_input.nextLine());
            if (num == 1) {
                System.out.println("Author Name:");
                Scanner authorName = new Scanner(System.in);
                String authorName1 = authorName.nextLine();
                System.out.println("Title Name:");
                Scanner titleName = new Scanner(System.in);
                String titleName1 = titleName.nextLine();
                System.out.println("Number Of Pages:");
                Scanner numOfPages = new Scanner(System.in);
                int numOfPages1 = Integer.parseInt(numOfPages.nextLine());
                Book b = new Book(authorName1,titleName1,numOfPages1);
                if(!shelf1.isSheFull()){
                    shelf1.addBook(b);
                }else if(!shelf2.isSheFull()){
                    shelf2.addBook(b);
                }else if(!shelf3.isSheFull()){
                    shelf3.addBook(b);
                }else{
                    System.out.println("Library is full");
                }
            } if (num == 2) {
                System.out.println("Title of the book:");
                Scanner titleName = new Scanner(System.in);
                String titleName1 = titleName.nextLine();
                library.deleteBook(titleName1);
            } if (num == 3) {
                System.out.println("Reader name:");
                Scanner readerName = new Scanner(System.in);
                String readerName1 = readerName.nextLine();
                System.out.println("Reader id:");
                Scanner readerId = new Scanner(System.in);
                int readerId1 = Integer.parseInt(readerId.nextLine());
                library.registerReader(readerName1,null, readerId1);
            } if (num == 4) {
                System.out.println("Reader name:");
                Scanner readerName = new Scanner(System.in);
                String readerName1 = readerName.nextLine();
                library.removeReader(readerName1);
            } if (num == 5) {
                System.out.println("Author Name:");
                Scanner authorName = new Scanner(System.in);
                String authorName1 = authorName.nextLine();
                library.searchByAuthor(authorName1);
            } else if (num == 6) {
                exit = 0;
            } else {
                System.out.println("Invalid Number Pressed");
            }
        }

    }
}
