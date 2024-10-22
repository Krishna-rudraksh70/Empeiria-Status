import java.util.Scanner;

public class firstVowels {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++){
            if(str[i].charAt(0) == 'a' || str[i].charAt(0) == 'A' || str[i].charAt(0) == 'i' || str[i].charAt(0) == 'I' || str[i].charAt(0) == 'o' || str[i].charAt(0) == 'O' || str[i].charAt(0) == 'u' || str[i].charAt(0) == 'U' || str[i].charAt(0) == 'E' || str[i].charAt(0) == 'e')
                System.out.print(str[i].charAt(0));
        }

        sc.close();
    }
}