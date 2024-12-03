package Arrays;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double c;
        char ch;

        System.out.print("Enter temperature value : ");
        c = sc.nextDouble();

        System.out.print("Enter the unit if temperature (F for fehrenhiet, C for Celcius) : ");
        ch = sc.next().charAt(0);

        if(ch == 'C' || ch == 'c'){
            System.out.print(String.format("Fehrenhiet : %.2f", c+32));
        }
        else if(ch == 'F' || ch == 'f'){
            System.out.print(String.format("Celcius : %.2f", c-32));
        }


        sc.close();
    }
}
