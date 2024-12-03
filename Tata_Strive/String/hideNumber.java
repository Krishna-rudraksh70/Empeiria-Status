package String;
import java.util.Scanner;

public class hideNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = "";
        int d = sc.nextInt();

        if(2*d > s.length()-1){
            System.out.println("Hide Digit greater than given sentence");
        }
        else{
            for(int i=0; i<s.length(); i++){
                if(i>=d && i<=(s.length()-1-d)){
                    r += "X";
                }
                else{
                    r += Character.toString(s.charAt(i));
                }
            }
        }

        System.out.println(r);

        sc.close();
    }
}