package Exception_Handling;

import java.util.Scanner;

public class outOfBound {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the number of elements in the array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.print("Enter the number of elements in the array : ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the index of the array element you want to access : ");
            int k = sc.nextInt();

            try{
                System.out.println(String.format("The array element at index %d = %d", k, arr[k]));
                System.out.println("The array element successfully accessed");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The array element unsuccessfully accessed\n"+e);
            }

        }
    }
}
