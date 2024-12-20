import java.util.HashSet;
import java.util.Set;

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

public class HashSetBookMan {
    public static void main(String[] args) {

        Set<Book> set1 = new HashSet<>();
        Set<Book> set2 = new HashSet<>();

        set1.add(new Book(1, "No Longer Human", "Osamu Dazai", 13.32));
        set1.add(new Book(2, "The Fisherman", "John Langan", 19.52));
        set1.add(new Book(3, "The Lucifer Effect", "Philip Zimbardo", 12.39));

        set2.add(new Book(3, "The Scarlet Letter", "Nathaniel Hawthorne", 13.88));
        set2.add(new Book(4, "Takopi's Original Sin", "Taizan 5", 16.99));
        set2.add(new Book(5, "Silas Marner", "George Eliot", 6.97));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        Set<Book> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        Set<Book> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);

        Set<Book> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of Set 1 and Set 2 (Set 1 - Set 2): " + differenceSet);
    }
}
