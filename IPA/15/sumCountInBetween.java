import java.util.Scanner;

public class sumCountInBetween {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;

        for(int i=a; i<b; i++){
            if(i%3==0 && i%2==0){
                sum += i;
                count++;
            }
        }

        System.out.println("Sum : "+sum);
        System.out.println("Count : "+count);

        sc.close();
    }
}
