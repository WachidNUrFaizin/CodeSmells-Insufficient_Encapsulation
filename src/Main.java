public class Main {
    public static void main(String[] args) {
        // Create instances of Book and Author
        Book book1 = new Book("The Great Gatsby");
        Author author1 = new Author("F. Scott Fitzgerald");

        // Create an instance of Library to manage assignments
        Library library = new Library();

        // Assign the author to the book
        library.assignAuthorToBook(book1, author1);

        // Display book and author details
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor().getName());
    }
}