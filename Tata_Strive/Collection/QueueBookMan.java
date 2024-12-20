import java.util.LinkedList;
import java.util.Queue;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}

public class QueueBookMan {
    public static void main(String[] args) {

        Queue<Book> bookQueue = new LinkedList<>();

        bookQueue.offer(new Book(1, "No Longer Human", "Osamu Dazai", 13.32));
        bookQueue.offer(new Book(2, "The Fisherman", "John Langan", 19.52));
        bookQueue.offer(new Book(3, "The Lucifer Effect", "Philip Zimbardo", 12.39));

        System.out.println("Processing books in queue:");
        while (!bookQueue.isEmpty()) {
            System.out.println(bookQueue.poll());
        }

        System.out.println("\nAdding more books to the queue:");        
        bookQueue.offer(new Book(3, "The Scarlet Letter", "Nathaniel Hawthorne", 13.88));
        bookQueue.offer(new Book(4, "Takopi's Original Sin", "Taizan 5", 16.99));
        bookQueue.offer(new Book(5, "Silas Marner", "George Eliot", 6.97));

        System.out.println("\nProcessing new books:");
        while (!bookQueue.isEmpty()) {
            System.out.println(bookQueue.poll());
        }
    }
}
