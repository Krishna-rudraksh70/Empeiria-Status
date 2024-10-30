import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = n, i = 0;
        
        while (k>0) {
            i += Math.pow(k%10, 3);
            k /= 10;
        }

        if(n == i)
            System.out.println("Yes, the number is an Armstrong number");
        else
            System.out.println("No, the number is not an Armstrong number");

        sc.close();
    }
}
