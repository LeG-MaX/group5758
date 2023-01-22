package Lessons.Lesson3.Tasks;

public class Book {

    private String title;

    String getTitle() {
        return this.title;
    }

    Book(String bookTitle) {
        this.title = bookTitle;

    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
