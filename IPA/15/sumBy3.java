import java.util.Scanner;

public class sumBy3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            sum += (n%10);
            n /= 10;
        }

        if(sum%3==0)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}
