import java.util.Scanner;

public class firstLetter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = s.split(" ");
        
        s = "";
        for(int i=0; i<str.length; i++){
            s += str[i].charAt(0);
        }

        System.out.println(s);

        sc.close();
    }
}
