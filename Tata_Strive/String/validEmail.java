package String;
import java.util.Scanner;

public class validEmail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.contains("@") && s.contains(".com") && s.length()>5)
            System.out.println("Email Valid");
        else
            System.out.println("Email Invalid");

        sc.close();
    }
}
