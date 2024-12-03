package String;
import java.util.Scanner;

public class encryptionKey {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int key = sc.nextInt();
        String res="";

        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                res += Character.toString((char)('A'+ (s.charAt(i) - 'A' + key) % 26));
            }
            else if(Character.isLowerCase(s.charAt(i))){
                res += Character.toString((char)('a'+ (s.charAt(i) - 'a' + key) % 26));
            }
            else{
                res += Character.toString(s.charAt(i));
            }
        }

        System.out.println(res);

        sc.close();
    }
}
