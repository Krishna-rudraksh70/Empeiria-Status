package String;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        boolean f = false;

        if(a.length() == b.length()){
            char a1[] = a.toCharArray();
            Arrays.sort(a1);
            // a = a1.toString();

            char b1[] = b.toCharArray();
            Arrays.sort(b1);
            // b = b1.toString();

            for(int i=0; i<a1.length; i++){
                if(a1[i] != b1[i]){
                    f = true;
                    break;
                }
            }

            if(f)
                System.out.println("Strings are not anagrams");
            else
                System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}
