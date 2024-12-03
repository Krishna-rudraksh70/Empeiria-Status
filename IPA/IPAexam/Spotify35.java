import java.util.Scanner;

class Spotify{
    private int id;
    private String name;
    private String stype;
    private double price;
    private String groupSession;

    public Spotify(int id, String name, String stype, double price, String groupSession){
        this.id = id;
        this.name = name;
        this.stype = stype;
        this.price = price;
        this.groupSession = groupSession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGroupSession() {
        return groupSession;
    }

    public void setGroupSession(String groupSession) {
        this.groupSession = groupSession;
    }

}

public class Spotify35 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Spotify sp[] = new Spotify[n];

        for(int i=0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();

            sp[i] = new Spotify(a, b, c, d, e);
        }
        
        String name = sc.nextLine();
        Spotify k = searchSpotifyByName(sp, name);

        if(k==null)
            System.out.println("No Such User");
        else
            System.out.println(k.getName() + " : " + k.getStype());

        String stype = sc.nextLine();
        String groupSession = sc.nextLine();

        double avg = priceAvgByStypeAndGroupSession(sp, stype, groupSession);

        if(avg==0)
            System.out.println("No Such User");
        else
            System.out.println(avg);

        sc.close();
    }

    public static Spotify searchSpotifyByName(Spotify s[], String name){

        Spotify k = null;

        for(Spotify i: s){
            if(i.getName().equalsIgnoreCase(name)){
                k = i;
                break;
            }
        }

        return k;
    }

    public static double priceAvgByStypeAndGroupSession(Spotify s[], String stype, String groupSession){

        double avg = 0;
        int count = 0;

        for(Spotify i : s){
            if(i.getGroupSession().equalsIgnoreCase(groupSession) && i.getStype().equalsIgnoreCase(stype)){
                count++;
                avg += i.getPrice();
            }
        }

        avg /= count;

        return avg;
    }
}