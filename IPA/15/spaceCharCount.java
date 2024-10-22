import java.util.Scanner;

public class spaceCharCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] s = str.split(" ");
        char[] ch = str.toCharArray();

        System.out.println(s.length-1 +" "+ (ch.length-(s.length-1)));

        sc.close();
    }
}
