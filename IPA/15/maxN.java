import java.util.Scanner;
import java.util.Arrays;

public class maxN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int m = 0, c=0, max=Integer.MAX_VALUE, count=0;
        for(int i: a){
            if(a[i] == max)
                count++;
            else{
                max = a[i];
                count = 0;
            }

            if(count >= n/2 && count > c){
                m = max;
                c = count;
            }
        }

        System.out.println(m+" "+c);

        sc.close();
    }
}
