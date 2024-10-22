import java.util.Scanner;

public class charIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println(s.indexOf(c));

        sc.close();
    }
}
