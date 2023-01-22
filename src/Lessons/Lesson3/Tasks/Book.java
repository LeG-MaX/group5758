package Lessons.Lesson3.Tasks;

public class Book {

    String title;

    Book(String bookTitle) {
        this.title = newTitle();
    }

    private String newTitle() {
        return this.title;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
