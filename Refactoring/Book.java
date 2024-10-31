public class Book {
    private final Title title;
    private Author author;

    public Book(Title title) {
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void assignAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.author = author;
    }
}