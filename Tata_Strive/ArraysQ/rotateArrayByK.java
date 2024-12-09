package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByK {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int t;

        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<=k/2; i++){
            t = arr[i];
            arr[i] = arr[k-i];
            arr[k-i] = t; 
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
