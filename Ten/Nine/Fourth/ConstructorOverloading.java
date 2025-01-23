package Fourth;

class Book {
    String title;
    String author;

    // Constructor with one parameter
    Book(String t) {
        title = t;
        author = "Unknown";
    }

    // Constructor with two parameters
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Advanced Java", "John Doe");

        book1.display();
        book2.display();
    }
}
