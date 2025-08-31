package LibraryManagementSystem;

public class Main {

    public static void main(String[] args) {
        Book novelBook1 = new NovelBook("847375", "Title1", "Author1", "Genre1");
        Book novelBook2 = new NovelBook("659365", "Title2", "Author2", "Genre2");
        Book textBook1 = new TextBook("123456", "Physics", "Author3", "Science", 3);
        Book textBook2 = new TextBook("789012", "Mathematics", "Author4", "Math", 2);

        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addBook(novelBook1);
        library.addBook(novelBook2);
        library.addBook(textBook1);
        library.addBook(textBook2);

        Member member = new Member("John Doe", "8474837424");
        Librarian librarian = new Librarian("EMP001", "Jane Smith", "1234567890");
        library.registerUser(member);
        library.registerUser(librarian);

        System.out.println("Book details:");
        novelBook1.displayBookDetails();
        novelBook2.displayBookDetails();
        textBook1.displayBookDetails();
        textBook2.displayBookDetails();

        System.out.println("User details:");
        member.displayDashboard();
        librarian.displayDashboard();

        lendBook(member, textBook1);
        lendBook(librarian, textBook1);
        bookAvailability(textBook1);
        returnBook(member, textBook1);
        bookAvailability(textBook1);
        lendBook(librarian,textBook1);

    }

    private static void lendBook(User user, Book book) {
        if(book.lend(user)) {
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(user.getName() + " cannot borrow more books.");
        }
    }

    private static void returnBook(User user, Book book) {
        book.returnBook(user);
        System.out.println(user.getName() + " returned " + book.getTitle());
    }

    private static void bookAvailability(Book book) {
        if(book.isAvailable()) {
            System.out.println(book.getTitle() + " is available.");
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
}
