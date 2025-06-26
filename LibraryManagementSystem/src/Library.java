import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<User> users;

	public Library() {
		books = new ArrayList<>();
		users = new ArrayList<>();
	}

	// Add a book to library
	public void addBook(Book book) {
		books.add(book);
	}

	// Register user to library
	public void registerUser(User user) {
		users.add(user);
	}

	// Find book by Id
	public Book findBookById(String bookId) {
		for (Book book : books) {
			if (book.getBookId().equalsIgnoreCase(bookId.trim())) {
				return book;
			}
		}
		return null;
	}

	// Find user by Id
	public User findUserById(String userId) {
		for (User user : users) {
			if (user.getUserId().equalsIgnoreCase(userId.trim())) {
				return user;
			}
		}
		return null;
	}

	// List all books in library
	public void listBooks() {
		 System.out.println("\nBooks in Library:");
		for (Book book : books) {
			System.out.println(book);
		}
	}

	// Method to issue a book to user 
	public void issueBook(String bookId, String userId) {
		Book book = findBookById(bookId);
		User user = findUserById(userId);

		if (book == null || user == null) {
			System.out.println("Book or User not found.");
			return;
		}

		if (book.isIssued()) {
			System.out.println("Book is already issued.");
			return;
		}

		book.issueBook();
		user.borrowBook(book);
		System.out.println("Book issued successfully to " + userId);
	}

	// Method to Return a book to library
	public void returnBook(String bookId, String userId) {
		Book book = findBookById(bookId);
		User user = findUserById(userId);

		if (book == null || user == null) {
			System.out.println("Book or User not found.");
			return;
		}

		if (!user.getBorrowedBooks().contains(book)) {
			System.out.println("This user hasn't borrowed this book.");
			return;
		}

		book.returnBook();
		user.returnBook(book);
		System.out.println("Book returned successfully by " + userId);
	}

}
