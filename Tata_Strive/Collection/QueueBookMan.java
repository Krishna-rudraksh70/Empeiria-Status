import java.util.LinkedList;
import java.util.Queue;

class Booknew1 {
    private int id;
    private String title;
    private String author;
    private double price;

    public Booknew1(int id, String title, String author, double price) {
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
        Booknew1 Booknew1 = (Booknew1) obj;
        return id == Booknew1.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Booknew1{id=" + id + ", title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}

public class QueueBookMan {
    public static void main(String[] args) {

        Queue<Booknew1> Booknew1Queue = new LinkedList<>();

        Booknew1Queue.offer(new Booknew1(1, "No Longer Human", "Osamu Dazai", 13.32));
        Booknew1Queue.offer(new Booknew1(2, "The Fisherman", "John Langan", 19.52));
        Booknew1Queue.offer(new Booknew1(3, "The Lucifer Effect", "Philip Zimbardo", 12.39));

        System.out.println("Processing Booknew1s in queue:");
        while (!Booknew1Queue.isEmpty()) {
            System.out.println(Booknew1Queue.poll());
        }

        System.out.println("\nAdding more Booknew1s to the queue:");        
        Booknew1Queue.offer(new Booknew1(3, "The Scarlet Letter", "Nathaniel Hawthorne", 13.88));
        Booknew1Queue.offer(new Booknew1(4, "Takopi's Original Sin", "Taizan 5", 16.99));
        Booknew1Queue.offer(new Booknew1(5, "Silas Marner", "George Eliot", 6.97));

        System.out.println("\nProcessing new Booknew1s:");
        while (!Booknew1Queue.isEmpty()) {
            System.out.println(Booknew1Queue.poll());
        }
    }
}
