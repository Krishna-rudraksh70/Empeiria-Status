package Arrays;

import java.util.Scanner;

public class airthmetricOnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];
        int sum = 0, high = Integer.MIN_VALUE, low = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();

            if (high < arr[i])
                high = arr[i];

            if (low > arr[i])
                low = arr[i];

            sum += arr[i];
        }

        System.out.println(String.format(
                "Total Sales for the week : %d\nAverage Daily Sales : %.2f\nHighest Sales Amount in a Single Day : %d\nLowest Sales Amount in a Single Day : %d",
                sum, (double)sum / 7, high, low));

        sc.close();
    }
}
