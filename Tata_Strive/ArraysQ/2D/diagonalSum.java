import java.util.Scanner;

public class diagonalSum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc. nextInt();
        int sum = 0;

        int a[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
                if(i==j || i+j == n-1){
                    sum += a[i][j];
                }
            }
        }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(i==j || i+j == m-1)
        //             System.out.print(a[i][j]+"\t");
        //         else
        //             System.out.print(" \t");
        //     }

        //     System.out.println();
        // }

        System.out.println(sum);

        sc.close();
    }
}