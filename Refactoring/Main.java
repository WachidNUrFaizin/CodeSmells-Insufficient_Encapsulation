public class Main {
    public static void main(String[] args) {
        // Create instances of Book and Author
        Book book1 = new Book(new Title("The Great Gatsby"));
        Author author1 = new Author("F. Scott Fitzgerald");
        
        // Assign the author to the book
        book1.assignAuthor(author1);
        
        // Display book and author details
        System.out.println("Book Title: " + book1.getTitle().getTitle());
        System.out.println("Author: " + book1.getAuthor().getName());
    }
}