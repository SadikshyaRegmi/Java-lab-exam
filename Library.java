package D;

class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Python Programming", "John Doe");
        book1.display();
        book2.display();
    }
}

