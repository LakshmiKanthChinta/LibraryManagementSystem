# Library Management System (Java OOP)

## Objective
A mini Java application developed using Object-Oriented Programming (OOP) principles to manage books and users in a library. It provides features like listing books, issuing books to users, returning books, and viewing borrowed books.

## Tools Used
- Java (JDK)
- Eclipse IDE
- Terminal/Console

## Project Structure
```
LibraryManagementSystem/
├── src/
│ ├── Book.java
│ ├── User.java
│ ├── Library.java
│ └── LibraryManagementSystemMain.java
```

## How to Run This Project

1. Open Eclipse IDE.
2. Create a new Java Project and name it `LibraryManagementSystem`.
3. Inside the `src` folder, create four Java classes:
   - `Book.java`
   - `User.java`
   - `Library.java`
   - `LibraryManagementSystemMain.java`
4. Copy and paste the respective code into each file.
5. Right-click on `LibraryManagementSystemMain.java` and choose **Run As > Java Application**.

## Features Implemented

- Books and users are added manually in the main class (no input required for registration)
- List all books with their availability status
- Issue a book to a user (if available)
- Return a book from a user
- Show all books borrowed by a specific user
- Input validation for book and user IDs
- Simple and clear console-based menu interface

## Sample Console Output

```
Library Menu:
1. List Books
2. Issue Book
3. Return Book
4. Show Borrowed Books by User
5. Exit
Enter choice: 1

Books in Library:
B1 - Java Fundamentals by James Gosling [Available]
B2 - Data Structures by Mark Allen Weiss [Available]

Enter choice: 2
Enter Book ID: B1
Enter User ID: U1
Book issued successfully to U1

Enter choice: 4
Enter User ID: U1
Sai with id U1 has borrowed the following books :
-> Java Fundamentals by James Gosling (ID: B1)

Enter choice: 3
Enter Book ID: B1
Enter User ID: U1
Book returned successfully by U1
```

## OOP Concepts Used
- Encapsulation: Each class has its own fields and methods
- Abstraction: Library class handles internal operations like issue and return
- Modular Design: Code is separated into multiple reusable classes

## Author
Chinta Lakshmi Kanth

## Future Improvements

This project can be further enhanced with the following features:

- Allow users and books to be added dynamically via console input
- Add a feature to limit the number of books a user can borrow
- Integrate file or database storage for saving books and user data
- Add due dates and fine calculation for late returns

## License
This project is created for educational purposes and can be reused or modified for learning.
