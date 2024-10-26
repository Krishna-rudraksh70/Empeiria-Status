import java.util.Scanner;

public class avgLimit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int avg = 0, count = 0;

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
                
        for(int i=0; i<arr.length; i++){
            if(arr[i]>l1 && arr[i]<l2){
                avg += arr[i];
                count++;
            }
        }
    
        avg/=count;
        
        System.out.println(avg);
        
        sc.close();
}}