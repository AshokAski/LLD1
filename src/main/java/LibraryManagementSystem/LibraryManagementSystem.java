package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book> bookInventory = new ArrayList<>();
    private List<User> registeredUsers  = new ArrayList<>();

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public List<Book> searchBooks(String criteria) {
        List<Book> results = new ArrayList<>();
        for(Book book : bookInventory) {
            if(book.getTitle().contains(criteria) || book.getAuthor().contains(criteria)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchBooks(String criteria, String type) {
        List<Book> results = new ArrayList<>();
        for(Book book : bookInventory) {
            if((book.getTitle().contains(criteria) || book.getAuthor().contains(criteria)) && book.getClass().getSimpleName().equals(type)) {
                results.add(book);
            }
        }
        return results;
    }

    public void displayAllBooks() {
        for(Book book : bookInventory) {
            book.displayBookDetails();
            System.out.println("Available: " + book.isAvailable());
            System.out.println("-----------------------");
        }
    }

    public void displayAllUsers() {
        for(User user : registeredUsers) {
            user.displayDashboard();
            System.out.println("-----------------------");
        }
    }
}
