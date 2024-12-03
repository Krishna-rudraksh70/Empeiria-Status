package String;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String res = "";

        for(int i=s.length()-1; i>-1; i--){
            res += Character.toString(s.charAt(i));
        }

        System.out.println(res);

        sc.close();
    }
}
