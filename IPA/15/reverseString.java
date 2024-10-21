import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] str = s.split(" ");

        s="";

        for(int i=str.length; i>0; i--){
            s += str[i-1] + " ";
        }

        System.out.println(s);

        sc.close();
    }
}
