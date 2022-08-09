public class Book {
    private String name;
    private Author author;
    private int yearPublisher;

    public Book(String name, Author author, int yearPublisher) {
        this.name = name;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }

    public String getNameBook() {
        return this.name;
    }


    public Author getAuthorBook() {
        return this.author;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}


