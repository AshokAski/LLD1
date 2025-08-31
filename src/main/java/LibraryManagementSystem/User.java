package LibraryManagementSystem;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();

    public String getUserId() {
        return userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    User() {
        this.userId = generateUniqueIdMethod();
    }

    User(String name, String contactInfo) {
        this.userId = generateUniqueIdMethod();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User user) {
        this.userId = generateUniqueIdMethod();
        this.name = user.getName();
        this.contactInfo = user.getContactInfo();
    }

    private final String generateUniqueIdMethod() {
        return "User-" + (++totalUsers);
    }

    public int getTotalUsers() {
        return totalUsers;
    }
}
