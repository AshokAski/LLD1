package LibraryManagementSystem;

public class Librarian extends User{

    private String employeeNumber;

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Name: " + getName());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBook() {
        System.out.println("Librarian returning a book.");
    }

    public void addNewBook(Book book) {
        // Implementation to add a new book to the library system
    }
    public void removeBook(Book book) {
        // Implementation to remove a book from the library system
    }


}
