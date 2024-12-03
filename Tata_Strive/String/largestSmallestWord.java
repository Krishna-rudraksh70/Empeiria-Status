package String;
import java.util.Scanner;

public class largestSmallestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s = null, l = null, curr = "";
        int sm = Integer.MAX_VALUE, lr = Integer.MIN_VALUE;
        if (str.length() < 1) {
            System.out.println("NO word Found or String is Empty");
        } else {
            for (int i = 0; i < str.length(); i++) {

                if (Character.isLetter(str.charAt(i))) {
                    curr += Character.toString(str.charAt(i));
                } else {
                    if (curr.length() > 0) {
                        if (s == null || curr.length() < s.length()) {
                            s = curr;
                            sm = s.length();
                        }

                        if (l == null || curr.length() > l.length()) {
                            l = curr;
                            lr = l.length();
                        }

                        curr = "";
                    }
                }
            }

            if (curr.length() > 0) {
                if (s == null || curr.length() < s.length()) {
                    s = curr;
                }

                if (l == null || curr.length() > l.length()) {
                    l = curr;
                }
            }

            if (curr.length() > 0) {
                System.out.println(s + " : " + sm);
                System.out.println(l + " : " + lr);
            }
        }
        // String w[] = str.split(" ");

        // for(String i: w){
        // if(i.length() > lr){
        // lr = i.length();
        // l = i;
        // }
        // else if(i.length() < sm){
        // sm = i.length();
        // s = i;
        // }
        // }

        // System.out.println(sm + " : "+ s);
        // System.out.println(lr + " : "+ l);

        sc.close();
    }
}