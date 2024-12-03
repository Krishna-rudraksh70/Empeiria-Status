import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        StringBuffer s = new StringBuffer();
        String str = sc.nextLine();

        s.append(str).reverse();

        if(str.equals(s.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

        sc.close();
    }
}
