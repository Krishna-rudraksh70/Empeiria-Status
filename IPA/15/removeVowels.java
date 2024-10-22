import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String res = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U' || s.charAt(i) == 'E' || s.charAt(i) == 'e')
                continue;
            
            res += s.charAt(i);
        }

        System.out.println(res);

        sc.close();
    }
}