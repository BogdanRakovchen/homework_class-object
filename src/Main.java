public class Main {
    public static void main(String[] args) {

        Author authorDostoevski = new Author("Федор","Достоевсикй");
        Author authorPushkin = new Author("Александр","Пушкин");

        Book bookDostoevski = new Book( "Игрок", authorDostoevski, 1875 );
        Book bookPushkin = new Book( "Евгений Онегин", authorPushkin, 1865 );

        System.out.println("Автор книги " + bookDostoevski.getNameBook() + " - " + authorDostoevski.getFirstNameAuthor() +
                " " + authorDostoevski.getLastNameAuthor() +
                ", год публикации - " + bookDostoevski.getYearPublisher() );

        System.out.println();

        System.out.println("Автор книги " + bookPushkin.getNameBook() + " - " + authorPushkin.getFirstNameAuthor() +
                " " + authorPushkin.getLastNameAuthor() +
                ", год публикации - " + bookPushkin.getYearPublisher());

        bookDostoevski.setYearPublisher(1877);
        System.out.println("setter " + " - " + bookDostoevski.getYearPublisher());
    }
}