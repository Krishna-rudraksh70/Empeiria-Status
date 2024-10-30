import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = "";
        int count = 1;
        char c= s.charAt(0);

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != c){
                r += c+""+count;
                c = s.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
        }

        r += c+""+count;

        System.out.println(r);

        sc.close();
    }
}
