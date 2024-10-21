import java.util.Scanner;

public class avgLimit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the arrays:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Limit1:");
        int l1 = sc.nextInt();

        System.out.print("Limit2:");
        int l2 = sc.nextInt();
        if(l2>n)
            l2 = n;

        int res=0;
        for(int i=l1; i<l2; i++){
            res += arr[i];
        }

        res /= (l2-l1);

        System.out.println(res);

        sc.close();
    }
}
