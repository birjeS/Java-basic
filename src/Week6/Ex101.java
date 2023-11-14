package Week6;

import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        System.out.println("--- Search by Title ---");
        for (Book book : library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("--- Search by Publisher ---");
        for (Book book : library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }

        System.out.println("--- Search by Year ---");
        for (Book book : library.searchByYear(1992)) {
            System.out.println(book);
        }
    }
}

class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        return word.trim().toUpperCase().contains(searched.trim().toUpperCase());
    }
}

class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return this.title;
    }

    public String publisher() {
        return this.publisher;
    }

    public int year() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}
