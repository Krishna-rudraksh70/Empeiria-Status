import java.util.Scanner;

public class oddIndexChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String o = "";

        for(int i=0; i<s.length(); i+=2){
            o += s.charAt(i);
        }

        System.out.println(o);
        sc.close();

    }
}
