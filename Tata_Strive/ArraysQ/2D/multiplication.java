import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc. nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = 0;
                for(int k = 0; k < n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
