import java.util.Scanner;
import java.util.Arrays;

public class palindromeString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] s = str.split(" ");
        String[] r = new String[0];
        boolean k = true;

        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[i].length(); j++){
                if(s[i].charAt(j) != s[i].charAt(s[i].length()-1-j)){
                    k = false;
                    break;
                }
            }
            
            if(k){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = s[i];
            }

            k = true;
        }

        for(String i: r)
            System.out.println(i);

        System.out.println(r.length);

        sc.close();
    }
}
