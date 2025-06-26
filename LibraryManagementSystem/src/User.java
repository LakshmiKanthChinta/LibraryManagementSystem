import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter method for userId
    public String getUserId() {
        return userId;
    }

    // Getter method for name 
    public String getName() {
        return name;
    }

    // Adds a book to the user's borrowed list
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Removes a book from the user's borrowed list
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Returns the list of borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Displays all borrowed books by the user
    public void showBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(getName() + " with id "+getUserId() +" has not borrowed any books.");
        } else {
            System.out.println(getName() + " with id "+getUserId()+" has borrowed the following books :");
            for (Book book : borrowedBooks) {
                System.out.println("-> " + book.getTitle() +" by "+ book.getAuthor()+ " (ID: " + book.getBookId() + ")");
            }
        }
    }

    // Useful for displaying user info
    @Override
    public String toString() {
        return userId + " - " + name;
    }
}
