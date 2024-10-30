import java.util.Scanner;

public class maxAscii {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) > ch){
                ch = s.charAt(i);
            }
        }
        
        System.out.println(ch+" "+s.indexOf(ch));

        sc.close();
    }
}
