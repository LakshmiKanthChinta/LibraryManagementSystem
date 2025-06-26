import java.util.Scanner;

public class LibraryManagementSystemMain {
    public static void main(String[] args) {
        Library library = new Library();

        // Manually adding books and users
        library.addBook(new Book("B1", "Java Fundamentals", "James Gosling"));
        library.addBook(new Book("B2", "Data Structures", "Mark Allen Weiss"));
        library.registerUser(new User("U1", "Sai"));
        library.registerUser(new User("U2", "Abhi"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. List Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Borrowed Books by User");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    String userId = sc.nextLine();
                    library.issueBook(bookId, userId);
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    String returnBookId = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    String returnUserId = sc.nextLine();
                    library.returnBook(returnBookId, returnUserId);
                    break;
                case 4:
                	System.out.print("Enter User ID: ");
                    String uid = sc.nextLine();
                    User user = library.findUserById(uid);
                    if (user != null) {
                        user.showBorrowedBooks();
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                	System.out.print("Exiting Library... ");
                	break;
                default:
                    System.out.println("Invalid choice. Choose between 1 to 5 ");
            }
        } while (choice != 5);

        sc.close();
    }
}
