public class Book {
    private String title;
    private Author author;
    private int year;

    Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public float getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return String.format("%s, %s, %d год", title, author, year);
    }
}
