package Exception_Handling;

import java.util.Scanner;

public class divisionBy0 {
    public static void main(String[] args) {
        
        //try with resources
        try(Scanner sc = new Scanner(System.in)){

            String num1, num2;
            System.out.print("Enter first number: ");
            num1 = sc.next();

            System.out.print("Enter Second number: ");
            num2 = sc.next();

            int num3 = 0;

            try{
                num3 = Integer.parseInt(num1)/Integer.parseInt(num2);
            }catch(Exception e){
                System.out.println("Error here "+e);
            }
            finally{
                System.out.println(num3);
            }
        }

        //try without resources
        // Scanner sc = new Scanner(System.in);

        // String num1, num2;
        //     System.out.print("Enter first number: ");
        //     num1 = sc.next();

        //     System.out.print("Enter Second number: ");
        //     num2 = sc.next();

        //     int num3 = 0;

        //     try{
        //         num3 = Integer.parseInt(num1)/Integer.parseInt(num2);
        //     }catch(NumberFormatException e){
        //         System.out.println("\t\tInput Number\n"+e);
        //     }
        //     catch(ArithmeticException e){
        //         System.out.println("\t\tDivide by 0\n"+e);
        //     }
        //     finally{
        //         System.out.println(num3);
        //     }

        // sc.close();
        
    }
}
