package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean f = false;

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=1; i<n; i++){
            if(arr[i-1] != arr[i]-1){
                n = arr[i]-1;
                f = true;
                break;
            }
        }

        if(f)
            System.out.println(n);
        else
            System.out.println("There is no missing value");

        sc.close();
    }
}
