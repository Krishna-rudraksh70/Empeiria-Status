package String;
import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        // String str[] = s.split(" ");
        String res = "", sr = "";
        // s = "";

        // for(String i: str){
        //     res = "";
        //     for(int j=i.length()-1; j>-1; j--){
        //         res += i.charAt(j);
        //     }
        //     s += res+" ";
        // }

        // System.out.println(s);

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                res += sr + " ";
                sr = "";
            }
            else{
                sr = s.charAt(i) + sr;
            }
        }

        System.out.println(res+sr);

        sc.close();
    }
}