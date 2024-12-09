package ArraysQ;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int a=0, b=0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int t = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j)
                    continue;
                
                if(t-arr[i] == arr[j]){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }

        if(a==0 || b==0)
            System.out.println("No Sum Found");
        else
            System.out.println(String.format("Yes, [%d, %d] sum is %d", a, b, t));

        sc.close();
        }
}
