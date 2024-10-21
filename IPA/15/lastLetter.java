import java.util.Scanner;

public class lastLetter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String str = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                str += s.charAt(i-1);
            }
            if(i+1 == s.length()){
                str += s.charAt(i);
            }
        }

        System.out.println(str);

        sc.close();
    }
}
