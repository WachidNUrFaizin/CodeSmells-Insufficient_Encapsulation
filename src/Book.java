public class Book {
    private final String title;
    private Author author;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}