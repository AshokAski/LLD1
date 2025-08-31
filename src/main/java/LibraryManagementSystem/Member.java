package LibraryManagementSystem;

public class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }

    Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

}
