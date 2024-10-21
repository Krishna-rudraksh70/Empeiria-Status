import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum=0;

        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }

        if(sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");

        sc.close();
    }
}
