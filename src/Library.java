// File: Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in Library:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book != null && user != null && book.isAvailable()) {
            book.setAvailable(false);
            user.issueBook(book);
            System.out.println(user.getName() + " has issued the book: " + book.getTitle());
        } else {
            System.out.println("Issue Failed: Book not available or User not found.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book != null && user != null && user.getIssuedBooks().contains(book)) {
            book.setAvailable(true);
            user.returnBook(book);
            System.out.println(user.getName() + " has returned the book: " + book.getTitle());
        } else {
            System.out.println("Return Failed: Book/User not found or mismatch.");
        }
    }

    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    private User findUserById(int id) {
        for (User u : users) {
            if (u.getId() == id) return u;
        }
        return null;
    }
}
