import java.util.Scanner;

public class countSpace {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s =sc.nextLine();
        String[] str = s.split(" ");

        System.out.println(str.length-1);

        sc.close();
    }
}
