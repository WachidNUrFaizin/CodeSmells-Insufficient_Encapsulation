public class Title {
    private final String title;

    public Title(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}