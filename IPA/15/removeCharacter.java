import java.util.Scanner;

public class removeCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string:");
        String s = sc.nextLine();

        System.out.print("Enter the character:");
        char c = sc.next().charAt(0); //sc.nextLine();

        String str = s.replace(c, (char) 0);

        System.out.println(str);

        sc.close();
    }
}
