import java.util.Scanner;
import java.util.Arrays;

public class movieBudget {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Movie[] m = new Movie[4];
        for(int i=0; i<m.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            m[i] = new Movie(a, b, c, d);
        }

        String dir = sc.nextLine();
        int avg = findAvgBudgetByDirector(m, dir);
        if(avg == 0)
            System.out.println("Sorry - The given director has not yet directed any movie");
        else
            System.out.println(avg);

        int ret = sc.nextInt(); sc.nextLine();
        int bud = sc.nextInt(); sc.nextLine();
        Movie[] r = getMovieByRatingBudget(m, ret, bud);
        if(r == null)
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        else{
            for(Movie i: r){
                System.out.println("movieId: "+i.getMovieId()+" director: "+i.getDirector()+" rating: "+i.getRating()+" budget: "+i.getBudget());
            }
        }

        sc.close();
    }

    public static int findAvgBudgetByDirector(Movie[] arr, String s){
        int a = 0, count=0;

        for(Movie i: arr){
            if(i.getDirector().equalsIgnoreCase(s)){
                a += i.getBudget();
                count++;
            }
        }

        return (a==0)?0:a/count;
    }

    public static Movie[] getMovieByRatingBudget(Movie[] arr, int r, int b){
        Movie[] res = new Movie[0];

        for(Movie i: arr){
            if(i.getRating() == r && i.getBudget() == b){
                res = Arrays.copyOf(res, res.length+1);
                res[res.length-1] = i;
            }
        }

        return (res.length<1)?null:res;
    }
}

class Movie{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}