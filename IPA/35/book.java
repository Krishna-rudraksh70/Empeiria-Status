import java.util.Scanner;
import java.util.Arrays;

public class book {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        BBook[] bb = new BBook[4];
        for(int i=0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();

            bb[i] = new BBook(a, b, c, d, e);
        }

        BBook[] k = findBookWithMaximumPrice(bb);
        if(k == null)
            System.out.println("No Book found with mentioned attribute");
        else{
            for(BBook i: k){
                System.out.println(i.getId() +" "+ i.getTitle() +" "+ i.getAuthor() +" "+ i.getPages() +" "+ i.getPrice());
            }
        }

        String s = sc.nextLine();
        BBook j = searchBookByTitle(bb, s);
        if(j == null)
            System.out.println("No Book found with mentioned attribute");
        else
            System.out.println(j.getId() +" "+ j.getTitle() +" "+ j.getAuthor() +" "+ j.getPages() +" "+ j.getPrice());

        sc.close();
    }

    public static BBook[] findBookWithMaximumPrice(BBook[] arr){
        BBook[] r = new BBook[0];

        Arrays.sort(arr, (d1, d2) -> Double.compare(d2.getPrice(), d1.getPrice()));

        for(BBook i: arr){
            if(arr[0].getPrice() == i.getPrice()){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
            else if(arr[0].getPrice() != i.getPrice()){
                break;
            }
        }

        if(r.length < 1)
            return null;
        else
            return r;
    }

    public static BBook searchBookByTitle(BBook[] arr, String s){
        for(BBook i: arr){
            if(i.getTitle().equalsIgnoreCase(s))
                return i;
        }

        return null;
    }
}

class BBook{
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;
    
    public BBook(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}