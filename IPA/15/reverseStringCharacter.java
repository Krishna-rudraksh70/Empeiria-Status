import java.util.Scanner;

public class reverseStringCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s = "";

        for(int i=str.length(); i>0; i--){
            s += str.charAt(i-1);
        }

        System.out.println(s);

        sc.close();
    }
}
