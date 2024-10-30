import java.util.Scanner;

public class nonRepeatChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch = '0';
        
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);

            if(!s.substring(i+1, s.length()).contains(Character.toString(ch)))
                break;
        }

        System.out.println(ch);

        sc.close();
    }
}
