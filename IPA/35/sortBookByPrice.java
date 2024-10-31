import java.util.Scanner;
import java.util.Arrays;

public class sortBookByPrice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Book[] arr = new Book[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Book(a, b, c, d);
        }

        Book[] r = priceSort(arr);
        if(r == null){
            System.out.println("Input is empty");
        }
        else{
            for(Book i: r){
                System.out.println("Id: "+i.getId()+" Title: "+i.getTitle()+" Author: "+i.getAuthor()+" Price: "+i.getPrice());
            }
        }

        sc.close();
    }

    public static Book[] priceSort(Book[] a){
        if(a.length < 1){
            return null;
        }

        Arrays.sort(a, (d1, d2) -> Double.compare(d1.getPrice(), d2.getPrice()));

        return a;
    }
}

class Book{
    private int id;
    private String author;
    private String title;
    private double price;

    public Book(int id, String author, String title, double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}