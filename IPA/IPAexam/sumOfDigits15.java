import java.util.Scanner;

public class sumOfDigits15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;;
        }

        if(sum < 15)
            System.out.println(sum);
        else
            System.out.println("No Digit");

        sc.close();
    }

}