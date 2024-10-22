import java.util.Scanner;

public class vowelConsonentsCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int v=0, c=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U' || s.charAt(i) == 'E' || s.charAt(i) == 'e')
                v++;
            else
                c++;
        }

        System.out.println("Vowels counts : "+v);
        System.out.println("Consonents counts : "+c);

        sc.close();
    }
}
