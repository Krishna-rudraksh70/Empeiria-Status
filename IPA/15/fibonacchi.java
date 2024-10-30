import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a=0, b=1, r;

        System.out.print(a+" "+b);

        for(int i=2; i<n; i++){
            r = a+b;
            System.out.print(" " + r);
            a = b;
            b = r;
        }

        sc.close();
    }
}
