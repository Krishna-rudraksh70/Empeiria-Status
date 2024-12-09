package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int A=0, B=0;

        for(int i=0; i<a.length && i<b.length; i++){
            if(a[A] == b[B]){
                System.out.print(a[A]+" ");
                A++;
                B++;
            }
            else if(a[A] > b[B]){
                B++;
            }
            else if(a[A] < b[B]){
                A++;
            }
        }

        sc.close();
    }
}
