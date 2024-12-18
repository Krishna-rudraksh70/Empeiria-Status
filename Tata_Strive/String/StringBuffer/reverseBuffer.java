package String.StringBuffer;
import java.util.Scanner;

public class reverseBuffer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StringBuffer s = new StringBuffer();
        String str = sc.nextLine();

        s.append(str);
        s.reverse();
        System.out.println(s);

        sc.close();
    }
}
