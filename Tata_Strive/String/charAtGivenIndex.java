package String;
import java.util.Scanner;

public class charAtGivenIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int index = sc.nextInt();

        if(index > s.length()-1)
            System.out.println("Index out of Bound");
        else
            System.out.println(s.charAt(index));

        sc.close();
    }
}
