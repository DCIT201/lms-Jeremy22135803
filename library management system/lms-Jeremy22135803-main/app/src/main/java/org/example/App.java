public class App {
    public static void main(String[] args) {
        Library library = new library();

        // Add books to the library
        library.addBook(new Book("Introduction to Programming", "Roland Oppong", 2009));
        library.addBook(new Book("Data Mining", "Eric Owusu", 2021));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Jeremy", 1);

        // Borrow a book
        patron.borrowBook(new Book("Introduction to Programming", "Roland Oppong", 2009), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("Introduction to Programming", "Roland Oppong", 2009), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}