import java.util.Arrays;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("Books in " + name + "library:");
        Arrays.stream(books).forEach(book -> System.out.println(book.getTitle()));
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("To Kill a Mockingbird");

        Book[] libraryBooks = {book1, book2};
        Library library = new Library("Local Library", libraryBooks);

        library.displayBooks();
    }
}
