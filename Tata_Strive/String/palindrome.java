package String;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean f = false;

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                f = true;
                break;
            }
        }

        if(f)
            System.out.println("String not Palindrome");
        else
            System.out.println("String is Palindrome");

        sc.close();
    }
}
