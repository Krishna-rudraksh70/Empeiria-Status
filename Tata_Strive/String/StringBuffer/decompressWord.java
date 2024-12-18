package String.StringBuffer;

import java.util.Scanner;

public class decompressWord {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder s = new StringBuilder();
        sc.close();

        if(str.length()%2 != 0){
            System.out.println("Invalid String");
            return;
        }
        else{
            for(int i=0; i<str.length()-1; i+=2){
                s.append(String.valueOf(str.charAt(i)).repeat(str.charAt(i + 1) - '0'));
            }
        }

        System.out.println(s.toString());

    }
}
