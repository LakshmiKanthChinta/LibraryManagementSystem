public class Book {
	private String bookId;
	private String title;
	private String author;
	private boolean isIssued;

	public Book(String bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}

	// Getter for bookId
	public String getBookId() {
		return bookId;
	}

	 // Getter for title
	public String getTitle() {
		return title;
	}
	
	// Getter for author
		public String getAuthor() {
			return author;
		}

	 // Check if the book is issued
	public boolean isIssued() {
		return isIssued;
	}

	 // Mark the book as issued
	public void issueBook() {
		isIssued = true;
	}

	 // Mark the book as returned
	public void returnBook() {
		isIssued = false;
	}

	@Override
	public String toString() {
		return bookId + " - " + title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
	}
}
