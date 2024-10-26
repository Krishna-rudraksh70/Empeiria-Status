import java.util.Scanner;

public class oddsum8_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            if(i%2!=0){
                sum += arr[i];
            }
        }

        if(sum > 8 && sum < 50)
            System.out.println(sum);
        else
            System.out.println("NA");

        sc.close();
    }
}
