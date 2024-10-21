import java.util.Scanner;

public class countEvens {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) %2 == 0){
                count++;
            }
        }

        if(count>2)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}
